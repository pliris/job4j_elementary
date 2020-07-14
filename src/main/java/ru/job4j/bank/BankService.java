package ru.job4j.bank;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    private boolean checkBalance(Account account, String requisite, double amount) {
        boolean check = false;
        if (account != null) {
            if (account.getBalance() >= amount) {
                check = true;
            }
        }
        return check;
    }

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = null;
        List<Account> accounts = new ArrayList<>();
        user = this.findByPassport(passport);
        if (user != null) {
            accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
                users.put(user, accounts);
            }
        }
    }

    public User findByPassport(String passport) {
        User currentUser = null;
        currentUser = users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
        return currentUser;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = this.findByPassport(passport);
        if (user != null) {
            account = users.get(user).stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
            }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = this.findByRequisite(srcPassport, srcRequisite);
        Account destAccount = this.findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null) {
            if (this.checkBalance(srcAccount, srcRequisite, amount)) {
                destAccount.setBalance(destAccount.getBalance() + amount);
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
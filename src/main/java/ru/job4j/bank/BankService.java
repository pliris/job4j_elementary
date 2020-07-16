package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    private boolean checkBalance(Optional<Account> account, String requisite, double amount) {
        boolean check = false;
        if (account.isPresent()) {
            if (account.get().getBalance() >= amount) {
                check = true;
            }
        }
        return check;
    }

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = Optional.empty();
        List<Account> accounts = new ArrayList<>();
        user = this.findByPassport(passport);
        if (user.isPresent()) {
            accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> currentUser = Optional.empty();
        currentUser = Optional.ofNullable(users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst()
                .orElse(null));
        return currentUser;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> account = Optional.empty();
        Optional<User> user = this.findByPassport(passport);
        if (user.isPresent()) {
            account = Optional.ofNullable(users.get(user.get()).stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null));
            }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = this.findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = this.findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()) {
            if (this.checkBalance(srcAccount, srcRequisite, amount)) {
                destAccount.get().setBalance(destAccount.get().getBalance() + amount);
                srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                rsl = true;
            }
        }
        return rsl;
    }
}
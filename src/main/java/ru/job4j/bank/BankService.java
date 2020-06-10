package ru.job4j.bank;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

//    private boolean checkAccount(User user, Account account) {
//        boolean check = true;
//        if (!account.equals(users.get(user))) {
//            check = false;
//        }
//        return check;
//    }

    private boolean checkBalance(User user, String requisite, double amount) {
        boolean check = false;
        Account account = this.findByRequisite(user.getPassport(), requisite);
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
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                currentUser = user;
            }
        }
        return currentUser;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = this.findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            account = accounts.get(accounts.indexOf(new Account(requisite, -1)));
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = this.findByRequisite(srcPassport, srcRequisite);
        Account destAccount = this.findByRequisite(destPassport, destRequisite);
        if (this.checkBalance(this.findByPassport(srcPassport), srcRequisite, amount)) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
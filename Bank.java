package Assignment;

import java.util.ArrayList;
import java.util.List;

abstract class Bank implements Banking {
    protected String bankName;
    protected List<Account> accounts = new ArrayList<>();
    public Bank(String bankName) {
        this.bankName = bankName;
    }
    @Override
    public void createAccount(String branchName, String customerName, double
            initialDeposit) {
        Branch br = new Branch(branchName);
        Customer customer = new Customer(customerName);
        Account account = new Account(customer, initialDeposit);
        accounts.add(account);
        System.out.println("Account created for " + customerName + " at branch " +
                br.getName() +
                " with account number: " + account.getAccountNumber());
    }
    @Override
    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    @Override
    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account is not found.");
        }
    }
    @Override
    public void showAccountDetails(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Customer Name: " + account.getCustomer().getName());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
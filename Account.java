package Assignment;

class Account {
    private static int accountCounter = 1000;
    private String accountNumber;
    private Customer customer;
    private double balance;

    public Account(Customer customer, double initialDeposit) {
        this.customer = customer;
        this.balance = initialDeposit;
        this.accountNumber = "AC" + (++accountCounter);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
}
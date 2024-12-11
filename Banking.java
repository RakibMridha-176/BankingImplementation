package Assignment;

public interface Banking {
    void createAccount(String branchName, String customerName, double initialDeposit);
    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount);
    void showAccountDetails(String accountNumber);
}


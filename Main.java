import Assignment.BankA;
import Assignment.BankB;
import Assignment.Banking;

public class Main {
    public static void main(String[] args) {
        Banking bankA = new BankA();
        Banking bankB = new BankB();

        // Bank A Operations
        System.out.println("Bank A Information:- ");
        bankA.createAccount("Motijheel", "Abdul Halim", 50000);
        bankA.deposit("ac456w7", 20000);
        bankA.withdraw("ac456w7", 10000);
        bankA.showAccountDetails("ac456w7");

        // Bank B Operations
        System.out.println("\nBank B Information:- ");
        bankB.createAccount("Gulshan", "Mohammad Younus", 10000);
        bankB.deposit("gls145q2", 30000);
        bankB.withdraw("gls145q2", 20000);
        bankB.showAccountDetails("gls145q2");
    }

}

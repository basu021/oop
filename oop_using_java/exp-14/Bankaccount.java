public class Bankaccount {
    public static void main(String[] args) {
        Bank Basudev = new Bank();
        Basudev.CreateAccount("Basudev", 340393, "Savings", 9908);
        Basudev.PrintBalances();
        System.out.println("\nAdding 100 rupees and printing the value again...");
        Basudev.Deposit(1000);
        Basudev.PrintBalances();
        System.out.println("\nWithdrawing 100 rupees and printing the value again...");
        Basudev.Withdraw(100);
        Basudev.PrintBalances();
    }
}

class Bank {
    String name;
    int accNo;
    String accType;
    double balance;

    public void CreateAccount(String naam, int acno, String Accty, double bal) {
        this.name = naam;
        this.accNo = acno;
        this.accType = Accty;
        this.balance = bal;
    }

    public void Deposit(double amt) {
        this.balance = this.balance + amt;
    }

    public void Withdraw(double amt) {
        this.balance = this.balance - amt;
    }

    public void PrintBalances() {
        System.out.println("Name: " + this.name);
        System.out.println("Account Number: " + this.accNo);
        System.out.println("Account Type: " + this.accType);
        System.out.println("Balance: " + this.balance);
    }
}
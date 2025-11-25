// Abstract class
abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

//  subclass
class SavingsAccount extends BankAccount {
    double balance = 0;

    @Override
    void deposit(double amount) {
        balance = amount;
        System.out.println("Savings Account: d "+ amount);
    }

    @Override
    void withdraw(double amount) {
        balance = amount;
        System.out.println("Savings Account: w " + amount);
    }
}

//  subclass
class CurrentAccount extends BankAccount {
    double balance = 0;

    @Override
    void deposit(double amount) {
        balance = amount;
        System.out.println("Current Account: d " + amount);
    }

    @Override
    void withdraw(double amount) {
        balance = amount;
        System.out.println("Current Account: w"+ amount);
    }
}


public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1000);
        sa.withdraw(300);

        CurrentAccount ca = new CurrentAccount();
        ca.deposit(2000);
        ca.withdraw(500);
    }
}

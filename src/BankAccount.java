import javax.swing.*;

public class BankAccount {
    private int balance;

    public BankAccount(int initial_amount){
        if (initial_amount >=0)
            balance = initial_amount;
        else balance = 0;
    }


    boolean deposit(int amount) {
        boolean result = false;
        if (amount >= 0) {
            balance += amount;
            result = true;
        }
        else
            JOptionPane.showMessageDialog(null, "Invalid Amount");
        return result;
    }

    boolean withdraw(int amount) {
        boolean result = false;
        if (amount < 0) {
            JOptionPane.showMessageDialog(null,"Problems");
        }
        else if (amount > balance) {
            JOptionPane.showMessageDialog(null,"Invalid Amount");
        }
        else {
            balance -= amount;
            result = true;
        }
        return result;
    }
    public int getBalance() {
        return balance;
    }
}

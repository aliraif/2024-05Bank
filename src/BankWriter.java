import javax.swing.*;
import java.awt.*;

public class BankWriter extends JPanel{
    private int WIDTH = 300;
    private int HEIGHT = 200;
    private BankAccount bank;
    private String last_transaction;

    public BankWriter(String title,BankAccount b){
        bank = b;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle(title);
        f.setSize(WIDTH, HEIGHT);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT+22);
        g.setColor(Color.black);
        int text_margin = 50;
        int text_baseline = 50;
        g.drawString(last_transaction, text_margin, text_baseline);
        g.drawString("Amount = "+bank.getBalance()+" Won ",text_margin, text_baseline+20);
    }

    public void showTransaction(int amount,String message){
        last_transaction = amount + " Won " + message;
        this.repaint();
    }

    public void showTransaction(String message){
        last_transaction = message;
        this.repaint();
    }

}

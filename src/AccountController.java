public class AccountController {
    private BankReader reader;
    private BankWriter writer;
    private BankAccount account;

    public AccountController(BankReader r,BankWriter w,BankAccount a) {
        reader = r;
        account = a;
        writer = w;
    }

    public void proccessTransaction() {
        char command = reader.readCommand("To deposit D(amount) and to withdraw W(amount).\nTo exit enter Q");
        if (command == 'Q') {
            writer.showTransaction("Service exterminated");
            return;
        }
        else if (command == 'D') {
            int amount = reader.readAmount();
            if(account.deposit(amount))
                writer.showTransaction(amount,"Deposit successful");
            else
                writer.showTransaction(amount,"Deposit failed");
        }
        else if (command == 'W') {
            int amount = reader.readAmount();
            if (account.withdraw(amount))
                writer.showTransaction(amount,"Withdraw successful");
            else
                writer.showTransaction(amount,"Withdraw failed");
        }
        else
            writer.showTransaction("Invalid command");
        this.proccessTransaction();
    }
}

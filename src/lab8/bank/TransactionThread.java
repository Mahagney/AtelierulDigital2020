package lab8.bank;

public class TransactionThread extends Thread {
    private BankAccount from;
    private BankAccount to;
    private String name;
    private int amount;

    public TransactionThread(BankAccount from, BankAccount to, String name, int amount) {
        this.from = from;
        this.to = to;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run(){
        transfer();
    }

    private void transfer(){
        synchronized (from) {
            from.withdraw(amount);
            synchronized (to) {
                to.deposite(amount);
            }
        }
    }
}

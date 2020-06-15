package lab9.ex1;

public class BankAccount {
    private int amount;
    private String ownerId;

    public BankAccount(int amount, String ownerId) {
        this.amount = amount;
        this.ownerId = ownerId;
    }

    public int getAmount() {
        return amount;
    }

    public String getOwnerId() {
        return ownerId;
    }
}

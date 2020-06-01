package lab8.bank;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount ba1 = new BankAccount(1000,"BA1");
        BankAccount ba2 = new BankAccount(50,"BA2");

        System.out.println(ba1);
        System.out.println(ba2);
        System.out.println();

        TransactionThread tt ;
        for(int i=0;i<5;i++){
            tt = new TransactionThread(ba1,ba2,"200 from ba1 to ba2",200);
            tt.start();
        }

        Thread.sleep(5000);
        System.out.println(ba1);
        System.out.println(ba2);

    }
}

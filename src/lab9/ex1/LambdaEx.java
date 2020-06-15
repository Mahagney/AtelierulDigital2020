package lab9.ex1;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx {
    public static int getAmount(List<BankAccount> list, String id){
        return list.stream()
                .filter(ba -> ba.getOwnerId().equals(id))
                .mapToInt( ba -> ba.getAmount())
                .sum();
    }
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList();
        accounts.add(new BankAccount(100, "123"));
        accounts.add(new BankAccount(200, "1234"));
        accounts.add(new BankAccount(200, "123"));
        accounts.add(new BankAccount(400, "123"));
        accounts.add(new BankAccount(400, "1234"));

        System.out.println(getAmount(accounts,"123"));


    }
}

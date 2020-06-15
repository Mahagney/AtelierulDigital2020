package lab9.ex1;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int factor = 2;
        IntStream s = IntStream.range(1,10)
                .map(e->{
                    System.out.println(e);
                    return e*factor;
                })
                .filter(e->{
                    System.out.println("filter " + e);
                    return e>5;
                });
        OptionalInt first = s.findFirst();
        System.out.println("first = [" + first + "]");
    }
}

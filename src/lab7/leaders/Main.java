package lab7.leaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,7,5,6,4,2,3,1);
        list = Leader.getLeaders(list);
        System.out.println(list);
    }
}

package lab7.leaders;

import java.util.*;

public class Leader {
    public static List<Integer> getLeaders(List<Integer> intList){
        List<Integer> leaders = new ArrayList<Integer>();

        Collections.reverse(intList);
        int max = intList.get(0);
        leaders.add(max);

        Iterator<Integer> it= intList.iterator();
        int current;
        while(it.hasNext()){
            current = it.next();
            if(current > max){
                leaders.add(current);
                max = current;
            }
        }

        return leaders;
    }
}

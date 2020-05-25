package lab7.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Integer> mergeLists(List<Integer> l1, List<Integer> l2){
        List<Integer> toReturn = new ArrayList<Integer>();

        int i=0;
        int j=0;

        while(i<l1.size() && j <l2.size()){
            if(l1.get(i)<l2.get(j)){
                toReturn.add(l1.get(i));
                i++;
            }else{
                toReturn.add(l2.get(j));
                j++;
            }
        }

        while(j<l2.size()){
            toReturn.add(l2.get(j));
            j++;
        }

        while(i<l1.size()){
            toReturn.add(l1.get(i));
            i++;
        }


        return toReturn;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,5,8,9,20);
        List<Integer> l2 = Arrays.asList(2,3,4,6,8,11,12,13,14);

        List list = mergeLists(l1,l2);
        System.out.println(list);
    }
}

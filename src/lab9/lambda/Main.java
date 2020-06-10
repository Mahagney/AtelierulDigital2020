package lab9.lambda;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void ex1(List<String> words){
        StringBuilder stringResult = new StringBuilder();
        words.forEach(word -> stringResult.append(word.charAt(0)));
        System.out.println(stringResult);
    }

    public static void ex2(List<String> words){
        words = words.stream().filter(word-> word.length() % 2 == 0 )
                .collect(Collectors.toList());
        System.out.println("words = " + words );
    }

    public static void ex3(List<String> words){
        words = words.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
        System.out.println( "words = " + words );
    }

    public static void ex4(Map<String,String> animals){
        String result = animals.entrySet().stream()
                .map(set -> set.getKey() + set.getValue())
                .collect( Collectors.joining( "," ) );

        System.out.println("result = " + result );
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","Dog","NO", "Chair");
        ex1(words);
        ex2(words);
        ex3(words);

        Map<String,String> stringMap = new HashMap<String, String>();
        stringMap.put("dogKey", "dogName");
        stringMap.put("catKey", "catName");
        stringMap.put("cowKey", "cowName");
        ex4(stringMap);

    }

}

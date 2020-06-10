package lab9;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CH1 {
    @Test
    public void consumer1(){
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));

        Consumer<List<String>> consumer =  param -> param.clear();
        consumer.accept(list);

        Assert.assertEquals(list, new ArrayList<>());
    }

    @Test
    public void consumer2(){
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a","b","c", "first", "second"));

        Consumer<List<String>> c1 =  l -> l.add("first");
        Consumer<List<String>> c2 =  l -> l.add("second");

        Consumer<List<String>> c3 =  c1.andThen(c2);

        c3.accept(list);

        Assert.assertEquals(list, list2);
    }
}

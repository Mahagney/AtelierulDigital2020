package lab9;


import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class CH2 {
    @Test
    public void predicate1() {
        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> notPredicate = p1.negate();

        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("Not empty"));
    }
}
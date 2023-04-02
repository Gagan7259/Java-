package java8feature_2;

import java.util.function.Predicate;

public class Predicatye2 {
    public static void main(String[] args) {
        Predicate<String> k = a -> a.length() > 3;
        System.out.println(k.test("Manoj"));
    }
}

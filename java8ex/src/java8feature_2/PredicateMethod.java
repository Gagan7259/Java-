package java8feature_2;

import java.util.function.Predicate;

public class PredicateMethod {
    public static void main(String[] args) {
        Predicate<String> a = (k) -> {
            return k.length() > 10;
        };
        System.out.println(a.test("Apple"));
    }
}

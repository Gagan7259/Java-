package java8feature_2;

import java.util.function.Predicate;

public class FunctionalInterfacee {
    public static void main(String[] args) {
        Predicate<String> a = str -> str.length() > 5;
        System.out.println(a.test("ikl"));

    }

}

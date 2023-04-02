package java8feature_2;

import java.util.function.Supplier;

public class Supplier2 {
    public static void main(String[] args) {
        Supplier<Double> getran=()->Math.random();
        System.out.println(getran.get());
    }
}

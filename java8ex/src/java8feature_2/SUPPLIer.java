package java8feature_2;

import java.util.function.Supplier;

public class SUPPLIer {
    public static void main(String[] args) {
        Supplier<Double> randomnum=()->Math.random();
        System.out.println(randomnum.get());
    }
}

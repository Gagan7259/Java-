package java8feature_2;

import java.util.function.Function;

public class FunctionMethod {
    public static void main(String[] args) {
        Function<Integer,Integer> a=(k)->{return k*k;};
        System.out.println(a.apply(10));
    }
}

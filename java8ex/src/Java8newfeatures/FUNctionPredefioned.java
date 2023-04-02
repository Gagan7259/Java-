package Java8newfeatures;

import java.util.function.Function;

public class FUNctionPredefioned {

    static Function<Integer, Integer> v = (h) -> {
        return h * h;
    };

    public static void main(String[] args) {
        System.out.println(v.apply(20));
    }
}

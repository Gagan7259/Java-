package Java8newfeatures;

import java.util.function.Function;

public class squareDemo {
    static Function<Integer, Integer> f = n ->
            n * n;

    public static void main(String[] args) {
        System.out.println(f.apply(23));
    }
}

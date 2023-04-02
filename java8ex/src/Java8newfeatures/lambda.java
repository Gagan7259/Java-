package Java8newfeatures;

public class lambda {
    public static void main(String[] args) {
        Circle c1 = (double radius) -> {
            System.out.println(Math.PI * radius * radius);
        };
        c1.calArea(200);

    }
}


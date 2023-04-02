package Java8newfeatures;

public class caluclate {
    public static void main(String[] args) {
        Volume v = (int radius, int height) -> {
            System.out.println(Math.PI * radius * radius * height);
        };
        v.cylinder(10, 26);
    }
}

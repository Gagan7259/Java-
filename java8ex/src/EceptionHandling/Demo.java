package EceptionHandling;

public class Demo {
    public static void main(String[] args) {
        int[] size = {34, 56, 78, 90};
        try {
            System.out.println(size[10]);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package EceptionHandling;

public class Arrayboundexception {
    public static void main(String[] args) {
        int[] id = {1, 2, 3, 4, 5};
        try {
            System.out.println(id[10]);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

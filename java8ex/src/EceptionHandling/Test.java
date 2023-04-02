package EceptionHandling;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello - 1");
        try {
            System.out.println(10 / 0);

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
          //  System.out.println(e.printStackTrace());
            System.out.println(e.getMessage());


        }
        System.out.println("hello - 2");

    }
}

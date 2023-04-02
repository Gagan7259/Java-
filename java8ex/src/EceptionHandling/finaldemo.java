package EceptionHandling;

public class finaldemo {
    public static void main(String[] args) {
        System.out.println("Hello-1");
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block always exicute ");
        }
    }
}

package Exception2exp;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class java1 {
    public static void main(String[] args) {
        try {
            PrintWriter p = new PrintWriter("11.txt");
            p.println("Hey Hello");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}

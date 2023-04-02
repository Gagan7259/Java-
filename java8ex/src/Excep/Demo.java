package Excep;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p=new PrintWriter("data.txt");
        p.println("hello ge");
    }
}

package Collections;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    //i\ts used to retrive the data
    public static void main(String[] args) {
        ArrayList a=new ArrayList();

        List l=new ArrayList();

        a.add(100);
        a.add(true);
        a.add("Gagan");

        l.add(120);
        l.add(true);
        l.add(false);

        a.addAll(l);

        System.out.println(a);
        System.out.println("------------------");

        System.out.println(l);
        System.out.println("____________________");
        System.out.println(a);


    }
}

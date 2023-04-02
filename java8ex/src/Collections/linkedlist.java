package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    //it's used for insertion and deleting the data
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        List ll=new ArrayList();
        l.add(100);
        l.add(true);
        l.add("ten");
        l.add("Manoj");

        ll.add(true);
        ll.add(false);
        System.out.println(l);
        System.out.println(ll);

        l.addAll(ll);
        System.out.println(l);
        System.out.println("****************************");

        for(Object a11:l){
            System.out.println(a11);
        }
    }
}

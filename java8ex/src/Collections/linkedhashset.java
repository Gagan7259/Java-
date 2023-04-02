package Collections;

import java.util.*;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(100);
       // lhs.add("ok");
       // lhs.add(true);
        lhs.add(200);
        lhs.add(10);
        System.out.println(lhs);
        Iterator i= lhs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("*******************");

        List l=new ArrayList(lhs);
        Collections.sort(l);
        System.out.println(l);
    }
}

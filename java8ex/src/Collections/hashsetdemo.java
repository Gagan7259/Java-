package Collections;

import java.util.*;

public class hashsetdemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        //hs.add("ok");
      //  hs.add(true);
        hs.add(200);
        hs.add(10);
        System.out.println(hs);

        Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("*********************8");
        List lo = new ArrayList(hs);
        Collections.sort(lo);
        System.out.println(lo);
    }
}

package Map;

import java.util.*;

public class hashmapdemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(101, "Gagan");
        hm.put(103, "Manoj");
        hm.put(103, "Jai");
        hm.put(106, "Mano");
        System.out.println(hm);
        Set s = hm.keySet();
        System.out.println(s);
        Collection s1 = hm.values();
        System.out.println(s1);
        Set s2 = hm.entrySet();
        System.out.println(s2);
        System.out.println("**************");

        Iterator i = hm.keySet().iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("****************");
//        Iterator j=hm.values().iterator();
//        while(j.hasNext()){
//            System.out.println(i.next());
//        }

        Iterator j = s2.iterator();
        while (j.hasNext()) {
            Map.Entry m1 = (Map.Entry) j.next();
            System.out.println(m1.getKey());
        }
    }
}

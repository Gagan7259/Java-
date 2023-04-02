package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylistdemo {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(100);
        a.add(209);
        a.add(500);
        a.add(1000);
        a.add(5069);
        a.add(2);
        System.out.println(a);
        System.out.println("Reading values using cursor");
        Iterator i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
        for (Object obj : a) {
            System.out.println(obj);

        }
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);


    }
}

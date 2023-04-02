package Map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class retainall {
    //written common values
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        List ll = new ArrayList();
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);

        ll.add(500);
        ll.add(600);
        ll.add(100);
        System.out.println(l);
        System.out.println(ll.retainAll(l));
        System.out.println(ll);
    }
}

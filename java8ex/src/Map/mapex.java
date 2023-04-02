package Map;

import java.util.HashMap;

public class mapex {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(101, "Gagan");
        hm.put(103, "Manoj");
        hm.put(103, "Jai");

        hm.put(106, "Mano");

        System.out.println(hm);
        System.out.println("***************");
        System.out.println(hm.get(103));
        System.out.println("*********************");
        hm.remove(103);
        System.out.println(hm);
        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue("Mano"));



    }
}

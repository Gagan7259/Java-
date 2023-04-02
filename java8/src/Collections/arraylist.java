package Collections;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		List l = new ArrayList();
		a.add(100);
		a.add(true);

		l.add(true);
		l.add(false);
		System.out.println(a);
		System.out.println(l);
		
		a.addAll(l);
		System.out.println(a);
	}
}

package clct;

import java.util.ArrayList;
import java.util.List;

public class arrylist {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		List a1 = new ArrayList();
		a.add(100);
		a.add(true);
		a.add("Gagan");
		
		
		a1.add(true);
		a1.add(false);
		
		
		a1.addAll(a);
	}
}

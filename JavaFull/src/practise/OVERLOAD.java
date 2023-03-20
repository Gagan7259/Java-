package practise;

public class OVERLOAD {
	public void wish(String s) {
		System.out.println("Hahha");
	}

	public void wish(StringBuffer sb) {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		OVERLOAD v = new OVERLOAD();
		//v.wish(new Object());
		v.wish("hello good morning");
		v.wish(new StringBuffer("welcome"));
		//v.wish(null);
	}

}

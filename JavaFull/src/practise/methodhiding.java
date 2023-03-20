package practise;

public class methodhiding {
	//declare as static methods 
	//rectify through object reference
	public static void m1() {
		System.out.println("parent class");
	}

}
class b extends methodhiding {
	public static void m1() {
		System.out.println("child classs");
	}

}
class Test {
	public static void main(String[] args) {
		b obj=new b();
		b.m1();
		
		methodhiding m = new b();
		m.m1();
		
	}
}

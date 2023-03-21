package ACCOUNTEX;

public class Test2 {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Test2 T = new Test2();
		T.setA(100);
		System.out.println(T.getA());
	}
}

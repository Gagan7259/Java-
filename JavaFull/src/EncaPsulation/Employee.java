package EncaPsulation;

public class Employee {
	private String pName;
	private int id;

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

class A {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setpName("Gagan");
		System.out.println(e.getpName());
		e.setId(101);
		System.out.println(e.getId());
	}
}

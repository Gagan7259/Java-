package LanguagePackage;


public class Employee {
	int eid;
	String ename;

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public static void main(String[] args) {
		Employee e = new Employee(101, "Gagan");
		Employee e2=new Employee(200, "Manoj");
		Employee e3=e2;
		System.out.println(e.equals(e2));
		System.out.println(e.equals(e3));
		System.out.println(e2.equals(e3));
		System.out.println(e2==e3);
		System.out.println(e==e2);

	}
}

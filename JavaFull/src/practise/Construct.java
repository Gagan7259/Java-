package practise;

class Construct {
	// in java constructer-its special method tyo intialize object values
	// object creattion not enough we sholud perform intialization
	// class name and constructer smust be SAME
	// to intialize object values automaticaly exicute
	int id;
	String pName;

	Construct(int id, String pName) {
		this.id = id;
		this.pName = pName;
	}

	public static void main(String[] args) {
		Construct c = new Construct(101, "iphone 5s");
		System.out.println(c.id);
		System.out.println(c.pName);
	}
}

package ACCOUNTEX;

public class PolyDemo {
	public static void main(String[] args) {
		SavingsAcc s = new SavingsAcc();
		s.setId(100);
		s.setAccName("ManoJ");
		s.setSal(50000.00);
		s.setMin_bal(5000.00);
		//System.out.println(s.getId() + ":" + s.getAccName() + ":" + s.getSal());

		CurrentAcc c = new CurrentAcc();
		c.setAccName("Dharani");
		c.setId(20);
		c.setSal(500000);
		c.setMin_bal(15000);
		//System.out.println(c.getId() + ":" + c.getAccName() + ":" + c.getSal());

		//s.cal_bal();
		//c.cal_bal();
		Test.showDetails(c);
		Test.showDetails(s);

	}
}

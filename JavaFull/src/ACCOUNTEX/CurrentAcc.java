package ACCOUNTEX;

public class CurrentAcc extends Account {
	private double min_bal;

	public double getMin_bal() {
		return min_bal;
	}

	public void setMin_bal(double min_bal) {
		this.min_bal = min_bal;
	}

	public void cal_bal() {
		double bal = getSal();
		double min_bal = getMin_bal();
		bal = bal - min_bal;
		System.out.println(bal);
	}
}

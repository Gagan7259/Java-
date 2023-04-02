package Excep;

class Insufficientfund extends Exception {
    public String toString() {
        return "Please deposit money";
    }

}

public class throwexception {
    double balance = 50000;

    public static void main(String[] args) throws Insufficientfund {
        throwexception t = new throwexception();
        t.withdraw(500000);
    }

    public void withdraw(double amount) throws Insufficientfund {
        if (balance > amount) {
            System.out.println("Withdraw money");
        } else {
            throw new Insufficientfund();
        }
    }
}

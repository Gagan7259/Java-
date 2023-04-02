package Excep;

class Insufficientfunds extends Exception {
    public String toString() {

        return "Insufficent funds please deposit money";
    }
}

public class throwexc {
    double balanace = 10000;

    public static void main(String[] args) throws Insufficientfunds {
        throwexc t = new throwexc();
        t.withDraw(1000);
    }

    public void withDraw(double amount) throws Insufficientfunds {
        if (balanace > amount) {
            System.out.println("withdraw money");
        } else {
            throw new Insufficientfunds();
        }
    }

}

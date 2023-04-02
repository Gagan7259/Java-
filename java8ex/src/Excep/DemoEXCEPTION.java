package Excep;

class lowmanpower extends Exception {
    public String toString() {

        return "Plese get more man power";
    }
}

public class DemoEXCEPTION {
    int workers = 100;

    public static void main(String[] args) throws lowmanpower {
        DemoEXCEPTION n = new DemoEXCEPTION();
        n.gowork(1000);
    }

    public void gowork(int manpower) throws lowmanpower {
        if (workers > manpower) {
            System.out.println("Ur team get permison");
        } else {
            throw new lowmanpower();
        }
    }
}

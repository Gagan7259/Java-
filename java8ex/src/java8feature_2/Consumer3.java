package java8feature_2;

import java.util.function.Consumer;

class bus {
    private int Number;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
}

public class Consumer3 {
    public static void main(String[] args) {
        bus b = new bus();
        Consumer<bus> c = n -> n.setNumber(100);
        c.accept(b);
        System.out.println(b.getNumber());

    }
}

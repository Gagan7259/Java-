package java8feature_2;

import java.util.function.Consumer;

class Ok {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

public class Consumer2 {
    public static void main(String[] args) {
        Ok k = new Ok();
        Consumer<Ok> m = n -> n.setName("ManojAP");
        m.accept(k);
        System.out.println(k.getName());
    }
}

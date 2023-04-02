package java8feature_2;

import java.util.function.Consumer;

public class Employee {
    private String ename;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}

class Consumerx {
    public static void main(String[] args) {
        Employee n = new Employee();
        Consumer<Employee> a = (e) -> {
            e.setEname("ManoAP");
        };
        a.accept(n);
        System.out.println(n.getEname()
        );
    }
}

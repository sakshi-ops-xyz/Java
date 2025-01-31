package genericTasks;

import inheritance.singleLevel.A;

import java.util.List;

public class Abcd {
    public void method(List<? super Double> x) {
        for(var i: x) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        List l=List.of(12, 1.1, 2.0f);
        Abcd abcd=new Abcd();
        abcd.method(l);
    }
}

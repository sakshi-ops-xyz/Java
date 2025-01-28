package genericInterface;

import java.util.Map;

public interface MyInterface<T> {
    public void setName(T val);
    public T getName();
}

class A<T> implements MyInterface<T> {
    private T name;

    @Override
    public void setName(T val) {
        this.name=val;
    }

    @Override
    public T getName() {
        return this.name;
    }
}


class B implements MyInterface<String> {
    private String name;

    @Override
    public void setName(String val) {
        this.name=val;
    }

    @Override
    public String getName() {
        return this.name;
    }
}


class Main{
    public static void main(String[] args) {
        A<String> a=new A<>();
        a.setName("Sam");
        System.out.println(a.getName());

        A<Integer> a2=new A<>();
        a2.setName(1234);
        System.out.println(a2.getName());

        B b=new B();
        b.setName("Jam");
        System.out.println(b.getName());
    }
}
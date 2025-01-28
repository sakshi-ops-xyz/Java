package polymorphism;

public class MethodOverloading {
    public int calc(int x, int y) {
        return x+y;
    }

    public float calc(float x, float y) {
        return x+y;
    }

    public double calc(double x, double y) {
        return x+y;
    }
}

class Main {
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        System.out.println(m.calc(1,2));
        System.out.println(m.calc(1.0, 2.0));
        System.out.println(m.calc(1.0d, 3.0d));
    }
}


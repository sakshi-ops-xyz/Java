package varArgs;

public class VarArgs {
    public void method(String... str) {
        for(var i: str) {
            System.out.println(i);
        }
    }

    public void method2(int x, char a, int... i) {
        System.out.println(x);
        System.out.println(a);
        for(var y: i) {
            System.out.println(y);
        }
    }


}


class Main {
    public static void main(String[] args) {
        VarArgs v=new VarArgs();
        v.method("Hello", "Hi");
        v.method2(10, 'C', 10, 20, 30);
    }
}

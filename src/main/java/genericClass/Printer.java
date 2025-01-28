package genericClass;

public class Printer <T>{
    private T val;

    public void print(T val) {
        this.val=val;
        System.out.println(val);
    }
}

class Main {
    public static void main(String[] args) {
        Printer<Integer> i=new Printer<>();
        i.print(10);
    //    i.print('A);      cannot print a char

        Printer<Character> c=new Printer<>();
        c.print('A');
    }
}

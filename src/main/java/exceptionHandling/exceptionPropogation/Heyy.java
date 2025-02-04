package exceptionHandling.exceptionPropogation;

public class Heyy {

    public void a() /*throws Exception*/{
        throw new RuntimeException();
    }

    public void b() {
        a();
    }

    public void c() {
        try {
            b();
        } catch (RuntimeException e) {
            System.out.println("Abc");
        }
    }



    public static void main(String[] args) {
        Heyy h=new Heyy();
        h.c();
    }
}

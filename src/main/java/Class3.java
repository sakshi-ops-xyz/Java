import static java.lang.Thread.sleep;

class SingleTon implements Cloneable{
    private static SingleTon instance=null;
    private SingleTon() {}

    public static synchronized SingleTon getInstance() {
        if(instance != null) {
            System.out.println("234");
            return instance;
        }
        instance =new SingleTon();
        System.out.println("677");
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}


public class Class3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                SingleTon obj=SingleTon.getInstance();
                try {
                    SingleTon obj2=(SingleTon) obj.clone();
                    if(obj==obj2) System.out.println("true");
                    else System.out.println("False");
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                SingleTon obj=SingleTon.getInstance();
            }
        });


        thread1.start();
//        sleep(1000);
        thread2.start();

    }
}

package multithreading.synchronizationMutualExclusion;

public class Book {
    static int tickets=10;

    static public synchronized void book(int val) {
        if(val <= tickets) {
            try {
                Thread.sleep(1000L);          // display delay
            } catch(Exception e) {
                System.out.println(e);
            }
            tickets-=val;
            System.out.println("Booked "+val+" tickets by "+Thread.currentThread().getName()+". Ticket left: "+tickets);
        } else {
            System.out.println("Can't book "+val+" tickets by "+Thread.currentThread().getName()+", as ticket left: "+tickets);
        }
    }
}

class Thread1 extends Thread {
//    Book b=new Book();
    private int val;
    private Book book;

    Thread1(int val, Book book) {
        this.val=val;
        this.book=book;
    }

    @Override
    public void run() {
        this.book.book(this.val);
    }
}


class Thread2 extends Thread {
//    Book b=new Book();
    private int val;
    private Book book;

    Thread2(int val, Book book) {
        this.val=val;
        this.book=book;
    }

    @Override
    public void run() {
        this.book.book(this.val);
    }
}

class Main {
    public static void main(String[] args) {
        Book b1=new Book();
        Thread1 t1=new Thread1(3, b1);
        Thread2 t3=new Thread2(8, b1);
        t3.start();
        t1.start();

        Book b2=new Book();
        Thread1 t2=new Thread1(5, b2);
        Thread2 t4=new Thread2(7, b2);
        t4.start();
        t2.start();

    }
}





















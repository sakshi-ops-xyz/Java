package multithreading.producerConsumer;
import java.util.LinkedList;

import static java.lang.Thread.sleep;

public class SharedBuffer {
    LinkedList<Integer> buffer=new LinkedList<>();
    private int capacity=5;

    public synchronized void producer(int val) throws InterruptedException{
        if(buffer.size() == capacity) {
            System.out.println("Cannot produce, buffer is full.");
            wait();
        }
        buffer.add(val);
        System.out.println("Produced val: "+val);
        notify();
    }

    public synchronized int consumer() throws InterruptedException {
        if(buffer.size()==0) {
            System.out.println("Cannot consume, buffer is empty.");
            wait();
        }
        int val=buffer.removeFirst();
        notify();
        return val;
    }
}

class PC {
    public static void main(String[] args) {
        SharedBuffer sb=new SharedBuffer();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i=0;
                    while(true) {
                        sb.producer(i++);
                        sleep(1000);
                    }
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true) {
                        System.out.println("Consumed val: "+sb.consumer());
                        sleep(500);
                    }
                } catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}

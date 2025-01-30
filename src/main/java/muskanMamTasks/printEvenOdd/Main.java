package muskanMamTasks.printEvenOdd;
import javax.sound.midi.Soundbank;

import static java.lang.Thread.sleep;

class Print {
    private int val=0;

    public synchronized void printEven() throws InterruptedException {
        if(val % 2!=0) {
            wait();
        }
        System.out.println("Even value: "+val++);
        notify();
    }

    public synchronized void printOdd() throws InterruptedException {
        if(val % 2==0) {
            wait();
        }
        System.out.println("Odd value: "+val++);
        notify();
    }
}

public class Main {
    public static void main(String[] args) {
        Print p=new Print();

        Thread odd=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        p.printOdd();
                        sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        });

        Thread even=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        p.printEven();
                        sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        });

        even.start();
        odd.start();

    }
}

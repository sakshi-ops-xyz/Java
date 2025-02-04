package maandviMamTask;

import java.util.Arrays;

import static java.lang.Thread.sleep;

// Merge sort in Java

class Main {
    void merge(int array[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int M[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = array[q + 1 + j];
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    void mergeSort(int array[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public synchronized  static void main(String args[]) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int[] array = { 10,9,6,8,7};
                main ob = new main();
                ob.mergeSort(array, 0, array.length - 1);
                System.out.println("Sorted Array:");
                System.out.println(Arrays.toString(array));
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                int[] array = { 1,4,3,2,5};
                main ob = new main();
                ob.mergeSort(array, 0, array.length - 1);
                System.out.println("Sorted Array:");
                System.out.println(Arrays.toString(array));
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread1.start();
        System.out.println(Thread.currentThread().getName());

        thread2.start();
        System.out.println(Thread.currentThread().getName());
    }
}

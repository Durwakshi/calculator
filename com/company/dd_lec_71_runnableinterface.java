package com.company;

class ThreadRunnable1 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("i m a runnable interface for thread 1");
            i++;
        }
    }
}
class ThreadRunnable2 implements Runnable{
    public void run() {
        int j = 0;
        while (j< 1000) {
            System.out.println("i m a runnable interface for thread 2");
            j++;
        }
    }
}

public class dd_lec_71_runnableinterface {
    public static void main(String[] args) {
       ThreadRunnable1 bullet1 = new ThreadRunnable1();
       Thread gun1 = new Thread(bullet1);

       ThreadRunnable2 bullet2 = new ThreadRunnable2();
       Thread gun2 = new Thread(bullet2);

       gun1.start();
       gun2.start();

    }
}

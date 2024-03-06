package com.company;

class MyThread extends Thread{
    int i =0;
    public void run() {
        while (i < 400) {
            System.out.println("i m cooking");
            System.out.println("i am happy with my cooking");
            i++;
        }
    }
}class MyThread2 extends Thread{
    int i =0;
    public void run() {
        while (i < 400) {
            System.out.println("i m chatting");
            System.out.println("i am sad while chatting");
            i++;
        }
    }
}

public class dd_lec_70_threadclass {
    public static void main(String[] args) {
       MyThread m = new MyThread();
       MyThread2 m2 = new MyThread2();
       m.start();
       m2.start();
    }
}

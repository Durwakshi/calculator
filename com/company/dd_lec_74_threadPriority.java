package com.company;

class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }
    public void run(){

        while (true){
            System.out.println(this.getName());
        }
    }
}


public class dd_lec_74_threadPriority {
    public static void main(String[] args) {
      MyThr t1 = new MyThr("durwa1");
        MyThr t2 = new MyThr("durwa2");
        MyThr t3 = new MyThr("durwa3");
        MyThr t4 = new MyThr("durwa4");
        MyThr t5 = new MyThr("durwa5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

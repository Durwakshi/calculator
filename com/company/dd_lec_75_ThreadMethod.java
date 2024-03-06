package com.company;

class MyThr1 extends Thread{

    public void run(){

       /* while (true){
         //   System.out.println(this.getName());
            System.out.println("welcome");
            try {
                Thread.sleep(454);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/
    }
}

class MyThr2 extends Thread{

    public void run(){
        int i = 0;
        while (i<500){
           // System.out.println(this.getName());
            System.out.println("thank you");
            i++;
        }
    }
}

public class dd_lec_75_ThreadMethod {
    public static void main(String[] args) {
     MyThr1 t1 = new MyThr1();
     MyThr2 t2 = new MyThr2();
     t1.start();
    /* try {
         t1.join();
     }
     catch (Exception e){
         System.out.println(e);
     }*/
     t2.start();

    }
}

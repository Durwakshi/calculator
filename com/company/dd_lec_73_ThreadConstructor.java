package com.company;

class MyThre extends Thread{
    MyThre(String name){
      super(name);
    }
    public void run(){
        int a = 34;
        System.out.println(a);
    }
}

public class dd_lec_73_ThreadConstructor {
    public static void main(String[] args) {
      MyThre t1 = new MyThre("durwa");
      t1.start();
        System.out.println("id " +t1.getId());
        System.out.println("name "+t1.getName());
    }
}

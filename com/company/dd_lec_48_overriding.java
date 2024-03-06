package com.company;

class dee{
    public int m1(){
        return 4;
    }
    public void meth2(){
        System.out.println("this is the method2 of class dee");
    }
}
class pee extends dee{
    @Override
    public void meth2(){
        System.out.println("this is the method2 of class pee");
    }
}

public class dd_lec_48_overriding {
    public static void main(String[] args) {
        dee b = new dee();
        b.meth2();

        pee a = new pee();
        a.meth2();
    }

}

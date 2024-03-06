package com.company;

interface parent11{
    void meth1();
    void meth2();
}
interface child11 extends parent11{
    void meth3();
    void meth4();
}

class Sample11 implements child11{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class dd_lec_58_interfaceInheritance {
    public static void main(String[] args) {
        Sample11 s11 = new Sample11();
        s11.meth1();
        s11.meth2();
        s11.meth3();
        s11.meth4();
    }
}

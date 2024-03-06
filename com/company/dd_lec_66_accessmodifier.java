package com.company;

class d1{
    public int x = 5;
    protected int y =4;
    int z = 6;
    private int a = 7;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class dd_lec_66_accessmodifier {
    public static void main(String[] args) {
        d1 d = new d1();
        //  d.meth();
        System.out.println(d.x);
        System.out.println(d.y);
        System.out.println(d.z);
        //System.out.println(d.a); private modifiers cannot be accessed within the package
    }
}

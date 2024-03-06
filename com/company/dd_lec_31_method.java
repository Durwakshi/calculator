package com.company;

public class dd_lec_31_method {
    static int durwa(int x,int y){
        int z;
        z=x+y;
        return z;

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c;
       /* dd_lec_31_method obj = new dd_lec_31_method();
        c=obj.durwa(a,b);*/ // if there is no static keyword is used in method then we have to create the obj of class
        c=durwa(a,b);//if we are using static then there is no need to create the oject
        // static method ko static method ko bina object bnaaye call kar sakte hai
        System.out.println(c);
    }
}

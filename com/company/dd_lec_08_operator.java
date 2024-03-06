package com.company;

public class dd_lec_08_operator {
    public static void main(String[] args) {
        // Assignment operators ( = ,+=,*=)
        int a = 9;
         a += 8;
        System.out.println(a);

        // arithmetic operator (+,-,%,/,*) %-->modulo operator
        int b = 6;
        int c = b%4;
        System.out.println(c);

        //comparision operator(==,<=,>=) returns boolean value
        System.out.println(a==b);
        System.out.println(66>5);

        //logical operator(&&,||,!=)
        System.out.println(98<0||56>3);

        // bitwise operator(&)
        System.out.println(2&3);




    }
}

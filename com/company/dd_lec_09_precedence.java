package com.company;

public class dd_lec_09_precedence {
    public static void main(String[] args) {
        int x = 8;
        int y = 2;
        int z = (x-y)/2;
        System.out.println(z);


        int b =9;
        int a =2;
        int c=1;
        int d = (b*b-4*a*c)/2*a;
        System.out.println(d);

        int v = 9;
        int u = 5;
        int n = v*v - u*u;
        System.out.println(n);

        int e = a*b-c;
        System.out.println(e);


    }
}

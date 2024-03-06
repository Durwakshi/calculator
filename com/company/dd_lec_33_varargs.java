package com.company;

public class dd_lec_33_varargs {
    static int foo(int ...arr){
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("var agrs");
        System.out.println("the sum of 2 & 9 is : " +foo(2,9));
        System.out.println("the sum of 3,4,6 is : "+foo(3,4,6));
    }
}

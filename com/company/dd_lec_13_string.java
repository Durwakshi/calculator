package com.company;

public class dd_lec_13_string {
    public static void main(String[] args) {
        //there are 2 ways to initialize the string
        String st =new String("durwa");
        String str = "dhairya";
        System.out.println(st);
        System.out.println(str);


        int a = 10;
        float f = 9.845632f;

        //different formate to print the print statement
        System.out.print("durwa ");
        System.out.println("deshmukh");
        System.out.printf("the value of  int is %d and the value of float is %.2f     " ,a,f);//.2 with f will terminate the decimal after 2 values
        //printf and format are same
        System.out.format("the value of  int is %d and the value of float is %19f" ,a,f );//19 with f will increase the space by 19 including the value of float
    }
}

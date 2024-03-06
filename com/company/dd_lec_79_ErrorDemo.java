package com.company;
import java.util.*;

public class dd_lec_79_ErrorDemo {
    public static void main(String[] args) {
        //Syntax Error
        //int a  = 0 //ERROR: due to semicolon
        //b = 6;  //ERROR: due to variable not defined


        //LOGICAL ERROR
        // if we want to print the prime numbers between 0 to 10 then
        System.out.println("2");
        for(int i = 1;i<5;i++){
            System.out.println(2*i+1);
        }//here the logic of the program is wrong because 9 is not a prime number

        //RUNTIME ERROR
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the integer part of 1000 divided by n is : "+1000/n);


    }
}

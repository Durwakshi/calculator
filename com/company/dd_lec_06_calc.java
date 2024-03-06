package com.company;
import java.util.*;
public class dd_lec_06_calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks of subject1 :");
        int marks = sc.nextInt();
        System.out.print("enter the marks of subject2 :");
        int marks1 = sc.nextInt();
        System.out.print("enter the marks of subject3 :");
        int marks2  = sc.nextInt();
        System.out.print("enter the marks of subject4 :");
        int marks3 = sc.nextInt();
        System.out.print("enter the marks of subject5 :");
        int marks4 = sc.nextInt();

        int sum = marks + marks1 +marks2 +marks3+marks4;
        float avg = sum/500.0f;
        float percentage = avg*100;
        System.out.println("the percentage is:"+percentage);

    }

}

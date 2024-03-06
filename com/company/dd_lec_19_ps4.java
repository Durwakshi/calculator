package com.company;
import java.util.*;

public class dd_lec_19_ps4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       //problem 2
        /*System.out.print("enter the marks of subj1 : ");
        int sub1 = sc.nextInt();
        System.out.print("enter the marks of subj2 : ");
        int subj2 = sc.nextInt();
        System.out.print("enter the marks of subj3 :  ");
        int subj3 = sc.nextInt();
        float per = (sub1 + subj2 + subj3)/3.0f;
        if(sub1>33 && subj2>33 && subj3>33 && per>40){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }*/


        //problem 4
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("nothing");
        }


    }
}

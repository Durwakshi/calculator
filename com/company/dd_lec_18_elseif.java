package com.company;
import java.util.*;

public class dd_lec_18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age){
            case 18 :
                System.out.println("adult");
                break;
            case 22 :
                System.out.println("job");
                break;
            case 60:
                System.out.println("retired");
                break;
            default:
                System.out.println("get lost");
        }





       /* if(age>56){
            System.out.println("durwa");
        }
        else if(age>46){
            System.out.println("rachana");
        }else if(age>20){
            System.out.println("lakshya");
        }else{
            System.out.println("no one");
        }*/

    }
}

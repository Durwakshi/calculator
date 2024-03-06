package com.company;
import java.util.*;

public class dd_lec_82_nestedtrycatch {
    public static void main(String[] args) {
        int[] arr = {54,6,9};
        Scanner sc = new Scanner(System.in);
         boolean flag = true;
        System.out.println("the index of an array is : ");
        int ind = sc.nextInt();
        while (flag) {
            try {
                System.out.println("welcome");
                try {
                    System.out.println("Entered value of the index " + arr[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("index does not exist");
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println("Exception found");
            }
        }
        System.out.println("thanks");
    }
}

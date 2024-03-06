package com.company;

import javax.swing.*;

public class Cwh_01 {
    public static void main(String[] args) {
        //problem 1
      /*
        float [] marks = {19.8f,13.6f,56.5f,99.0f,58.08f};
        float sum = 0;
        for(float i:marks) {
            sum += i;
        }
        System.out.println("the sum of marks is :"+sum);*/


        //problem 2
        int [] dd= {15,18,98,77,56};
        int num = 16;
        for(int element : dd){
            if (element==num){
                System.out.println("num exist");
                break;
            }
        }
        
    }
}

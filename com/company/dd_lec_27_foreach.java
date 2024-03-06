package com.company;

public class dd_lec_27_foreach {
    public static void main(String[] args) {
        int[] marks = {89,78,97,56,67};
        System.out.println(marks.length);


        //displaying an array
        for(int i = 0;i< marks.length;i++) {
            System.out.println(marks[i]);
        }


        //displayng array in reverse order
        for(int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }


        //displaying an array using foreach loop
        for(int element:marks){
            System.out.println(element);
        }


    }
}

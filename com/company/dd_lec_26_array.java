package com.company;

public class dd_lec_26_array {
    public static void main(String[] args) {


        // 3 ways to create an array inside the java program
         int[] marks = new int[5];//declaration + memory allocation
        marks[0] = 89;
        marks[1] = 80;
        marks[2] = 87;
        marks[3] = 45;
        marks[4] = 65;
        //marks[5] = 86;// throw error array out of index bond
        marks[4] = 98;
        System.out.println(marks[0]);
        System.out.println(marks[4]);




         int[] mark; // declaration
         mark = new int[5];//memory allocation

         int[] maark = {90,78,86,56};//declaration + initialization
    }
}

package com.company;

public class dd_lec_24_breakconti {
    public static void main(String[] args) {

        //using break and continue with loops
       /* for (int i =0;i<=5;i++){
            System.out.println(i);
            System.out.println("durwa");
            if (i == 3) {
                System.out.println("end");
                break;
            }

        }int j=0;
        while(j<5){
            System.out.println(j);
            System.out.println("durwa");
            if (j == 3) {
                System.out.println("end");
                break;
            }
          j++;
        }*/



        for (int i =0;i<=5;i++){
            if (i == 3) {
                System.out.println("end");
                continue;
            }
            System.out.println(i);
            System.out.println("durwa");
        }



        /*int j=0;
        while(j<5){
            System.out.println(j);
            System.out.println("durwa");
            if (j == 3) {
                System.out.println("end");
                break;
            }
          j++;
        }*/

    }
}

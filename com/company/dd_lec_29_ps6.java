package com.company;

public class dd_lec_29_ps6 {
    public static void main(String[] args) {


        //problem 1
        /*float[] arr = {89.8f ,67.7f, 98.7f, 46.8f ,76.3f };
        float sum = 0;
        for(float element:arr){
           sum += element;
        }
        System.out.println("the sum of array is : "+sum);*/


        //problem 2
       /* int[] arr = {34,45,56,67,78,89,90};
        int hum = 56;
        for(int i:arr){
            if(i==hum){
                System.out.println("num exist");
                break;
            }

        }*/



        // problem 3
       /* float[] marks = {87.8f,56.7f,98.5f,76.5f,87.5f};
        float sum =0;
        float avg = 0;
        for (float i:marks){
            sum += i;
            avg = sum/5.0f;
        }
        System.out.println(avg);*/



        //prblm 5--> reversing an array
       /* int[] arr = {1,2,3,4,5,6};
        int l= arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i =0;i<n;i++){
            // swaping a[i] and a[l-1-i]
            temp = arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;

        }
        for (int i:arr){
            System.out.print(i);
        }*/

        //reversing an string
       /*String S = "durwa";
       String d= "";
       for (int i =0;i< S.length();i++){
           d = S.charAt(i) + d;
       }
        System.out.println(d);*/


       // System.out.println(Integer.MAX_VALUE);//to determine the max value in any array same goes for min value


        // prblm 8
        boolean isshorted = true;
        int[] arr = {1,2,13,4,5,6};
        for(int i=0;i< arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
               isshorted = false;
               break;
            }
        }
         if(isshorted){
             System.out.println("sorted");
         }
         else {
             System.out.println("not sorted");
         }



    }
}

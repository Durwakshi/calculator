package java_logicBuilding;

import java.util.Scanner;

public class Table1 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = 0;
        for(int i =1;i<=10;i++){
            n = 3;
            System.out.printf("%d * %d = %d \n",n,i,n*i);
        }*/

        //floyds triangle

       /* int num = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/



        //inverted half pyramid (180 degree rotated)
        /*for(int i = 1 ;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        //hollow rewctangle
      /* for(int i = 1;i<=4;i++){
           for(int j =1;j<=5;j++){
               if(i==1 || j==1 ||i==4||j==5){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }*/



        //0-1 triangle
        /*int sum;
        for(int i =1;i<=5;i++){
            for(int j =1;j<=i;j++){
               sum=i+j;
               if(sum%2==1){
                   System.out.print("0");
               }else{
                   System.out.print("1");
               }
            }
            System.out.println();
        }*/

        //palindromic pattern
       /* for(int i =1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int leftHalf = 1; leftHalf <= 5; leftHalf++) {
                System.out.print(leftHalf + "");
            }

            // the second inner loop
            // it prints the second half of the palindrome in reverse manner
            // for e.g. in third iteration it will print 2 1
            // so that combining first and second inner loop
            // will print 1 2 3 2 1 for the third line
            for (int rightHalf = 5 - 1; rightHalf >= 1; rightHalf--) {
                System.out.print(rightHalf + "");
            }
            System.out.println();
        }*/


        //fabonacci series
        int num1=0,num2=1;
        for(int i =0;i<10;i++){
            System.out.print(num1+" ");
            int num3=num1+num2;
            num1 = num2;
            num2 = num3;
        }
       // System.out.println(num1);
    }
}

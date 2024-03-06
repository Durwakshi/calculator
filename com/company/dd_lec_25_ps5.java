package com.company;

public class dd_lec_25_ps5 {
    public static void main(String[] args) {

        //problem 1
        /*for (int i =4;i>=0;i--) {
            for (int j =0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/


        //problem 2
       /* int i = 1;
        while(i<=10){
            System.out.println(2*i);
            i++;
        }*/



        //problem 3
        int sum = 0;
        int ans =0;
        int n = 5;
        for (int i =1;i<=10;i++){
            //System.out.format("%dx%d=%d\n",n,i,n*i);
            sum+=n;
            System.out.print(sum);
            ans +=sum;
        }
        System.out.println(ans);

        // problem 5 factorial
       /* int n = 5;
        int fact = 1;
        for(int i =1;i<=n;i++ ){
            fact *=i;
        }
        System.out.println(fact);



        // problem 9
        int m =8;
        int j = 1;
        int sum = 0;
        for(int i =1;i<=10;i++){
             j =m*i;
             sum = sum + j;
        }
        System.out.println(sum);*/
    }
}

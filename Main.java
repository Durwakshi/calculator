import java .util.*;
public class Main {
    public static void main(String[] args)
    {
      //  System.out.println("1\n1 2\n1 2 3\n1 2 3 4 ");
//      Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      if (a<0){
//          System.out.println("a is negative");
//      } else if (a==0) {
//          System.out.println("a is  zero");
//      } else  {
//        System.out.println("a is  positive");
//    }
      /*  sum of n natural numbers
     int n = sc.nextInt();
     int sum=0;
     for(int i=0;i<=n;i++){
         sum = sum+i;
     }
        System.out.println(sum);*/


       /* sum of the numbers in a given range
        int n = 2;
        int m = 6;
        int sum = 0;
        for(int i = n;i<=m;i++){
            sum+=i;
        }

        System.out.println(sum);*/


        //greatest of two numbers
       /* int a =19;
        int b = 8;
        if(a>b){
            System.out.println("a is greater");
        }else {
            System.out.println("a is lesser");
        }*/
        // StringBuffer s = new StringBuffer("durwa");
       // System.out.println(s.reverse());
        /*int l,i;
        String str = "Dhairya";
        String r = "";
        l= str.length();
        for(i=l-1; i>=0;i--){
           r += str.charAt(i);
        }
        System.out.println(r);*/
       // String str = "durwa";
        //System.out.println(str.toUpperCase());
        String s ="durwa dhairya";
        int l = s.length();
        for(int i = l-1;i>=0;i++){
            System.out.println(s.charAt(i));
        }

    }
}
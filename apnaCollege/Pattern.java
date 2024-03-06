package apnaCollege;

/*public class Pattern {

    public static void main(String[] args) {
        int num =1;
        for(int i = 1;i<=4;i++){
            for(int j = i;j>=1;j--){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}*/

import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper = sc.nextInt();
        int  lower = sc.nextInt();
        for(int i=lower;i<=upper;i++){
            int temp  = i;
            int r = 0;
            while(temp>0){
                r=(r*10)+(temp%10);
                temp/=10;

            }
            if(i==r)
                System.out.print(i+" ");
        }
    }
}

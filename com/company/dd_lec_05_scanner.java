package com.company;
import java.util.Scanner;
public class dd_lec_05_scanner {
    public static void main(String[] args) {
        System.out.print("enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        System.out.print("enter float value");
        float f = sc.nextFloat();
        System.out.println(f);
        sc.nextLine();//yeh use krna pdega wrna code yahi terminate ho jayega aur user se i/p nhi lega after int and float
        //mtlb yeh hai k agr humko string use krna hai int ya float ke baad toh hum sc.nextline()  method ka  use krna hoga
        System.out.print("enter  string value:");
        String str = sc.nextLine();
        System.out.println(str);
    }
}

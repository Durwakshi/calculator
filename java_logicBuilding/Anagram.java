package java_logicBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char c1[] = str1.toCharArray();
        char c2[] = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1,c2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

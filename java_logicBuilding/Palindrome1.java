package java_logicBuilding;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String rs = "";
        for (int i = str.length()-1;i>=0;i--){
            rs = rs +str.charAt(i);
        }
        if (str.equals(rs)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
       // System.out.println("original string :" +str);
        //System.out.println("reversed string : "+rs);
    }
}
 //to convert stringBuilder to string use toString() method
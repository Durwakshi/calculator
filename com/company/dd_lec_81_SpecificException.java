package com.company;
import java.util.*;

public class dd_lec_81_SpecificException {
    public static void main(String[] args) {
        int[] arr = {54,6,9};
        Scanner sc = new Scanner(System.in);

        System.out.println("the index of an array is : ");
        int ind = sc.nextInt();

        System.out.println("the number which is to be divided by the element of an array");
        int num = sc.nextInt();

        try{
            System.out.println(arr[ind]/num);
            System.out.println("the entered entities are right");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException found");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException found");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("some other exception found");
            System.out.println(e);
        }
    }
}

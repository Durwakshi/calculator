package com.company;
import java.util.*;

class MyException extends Exception{
    @Override
    public String getMessage() {
        return "i m getMessage()";
    }

    @Override
    public String toString() {
        return super.toString() + "i m toString()";
    }
}

public class dd_lec_83_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<7){
            try {
                throw new ArithmeticException("the exception");
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("thank you");
            }
            System.out.println("finished");
        }
    }
}

package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String getMessage() {
        return "the radius cannot be negative";
    }

    @Override
    public String toString() {
        return "enter the correct value of radius";
    }
}
public class dd_lec_84_throwThrows {
    // harry method
    public static double area(int r) throws NegativeRadiusException{
       if (r<0){
           throw new ArithmeticException();
       }
       else{
           double res = Math.PI*r*r;
           return res;
       }
    }

    public static void main(String[] args) {
      //shivam using harry method
        try {
           double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }

    }
}

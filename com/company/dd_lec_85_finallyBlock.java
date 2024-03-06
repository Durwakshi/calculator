package com.company;

public class dd_lec_85_finallyBlock {
    public static void main(String[] args) {
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
       /* catch (Exception e){
            System.out.println("Exception");
        }*/
        finally {
            System.out.println("finally block");
        }
    }
}

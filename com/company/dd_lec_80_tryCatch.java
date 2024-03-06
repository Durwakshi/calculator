package com.company;

public class dd_lec_80_tryCatch {
    public static void main(String[] args) {
      int a = 19;
      int b = 0;

      //without try catch block
      //int c = a/b;
        //System.out.println(c);


      //using try and catch block
      try{
          int c = a/b;
          System.out.println(c);
      }
      catch(Exception e){
          System.out.println("the try part didn't worked out");
          System.out.println(e);
      }
        System.out.println("the program ends here");
    }
}

package com.company;

 abstract class parent{
    public parent(){
        System.out.println("i m the constructor of parent class");
    }

     abstract public void greet();
 }

 class child extends parent{
     @Override
     public void greet(){
         System.out.println("Namaste");
     }
 }

  abstract class child2 extends parent{ // only possible when the class is declared as abstract
   public void dee(){
         System.out.println("durwa");
     }
 }


public class dd_lec_53_abstract {
    public static void main(String[] args) {
       //agar method abstract hai toh uski class bhi abstract hogi aur jab hum inherit karege toh child class ke andr
        //sari abstract method honi chahiye wrna uss class ko bhi extract define karna hoga

        //hum abstract class ka object nhi bna sakte sirf uska reference bna skte hai

        //parent b = new parent(); not allowed
        parent p = new child();
        child c = new child();
        //child2 c2 = new child2();  not allowed bcoz it is a abstract class

        c.greet();

    }
}

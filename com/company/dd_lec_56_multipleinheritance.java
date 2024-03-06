package com.company;

class CellPhone1{
    public int dailTheNO(int number){
        return 0;
    }
    public void call(){
        System.out.println("calling the friend");
    }
}

interface Music{
    int a=55;
    void playMusic();
    void downloadMusic();
}

interface Calculator{
    void sum();
    void subtract();
    private void division(){
        System.out.println("division");
    }
    default void multiplication(){
        int a = 4;
        int b = 6;
        int mul = a*b;
        division();
        System.out.println("perform the multiplication of given numbers a and b "+mul);
    }
}

interface GPS{
    String[] enterYourLocation();
    void direction();
}


class SmartPhone1 extends CellPhone1 implements Music,Calculator,GPS{
    public void playMusic(){
        System.out.println("play my fav song");
    }
    public void downloadMusic(){
        System.out.println("Download the song from google"); 
    }
    public void sum(){
        System.out.println("sum the numbers");
    }
    public void subtract(){
        System.out.println("subtract the numbers");
    }
    /*public void multiplication(){
        System.out.println("multiply the numbers");
    }*/
    public String[] enterYourLocation(){
        String[] loactionList = {"bhopal","delhi","pune","Mumbai"};
        return loactionList;
    }
    public  void direction(){
        System.out.println("Direction");
    }
}

public class dd_lec_56_multipleinheritance {
    public static void main(String[] args) {
     SmartPhone1 s = new SmartPhone1();
     s.multiplication();
     //we can add default methods in interface then we dont need to implement those methods separately in class
     //but if we add those method then overrided method will give the o/p


     String[] arr = s.enterYourLocation();
        for (String item:arr) {
            System.out.println(item);
        }
    }
}

package com.company;

class Phone{
    public void on(){
        System.out.println("Turning on the Phone...");
    }
    public void call(){
        System.out.println("Calling a friend......");
    }

}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on the SmartPhone....");
    }
    public void music(){
        System.out.println("Playing the music...");
    }
}

public class dd_lec_49_dynamicmethod {
    public static void main(String[] args) {
       // Phone obj = new Phone();//allowed where phone obj is reference and new phone() is the object
       // SmartPhone spobj = new SmartPhone();//allowed


        Phone obj = new SmartPhone();//it is allowed and is called dynamic method disspatch
        //smartphone obj = new phone(); is not allowed

        //we can call all the methods of phone class only but the method which is overrided will give the o/p of the SmartPhone class

        obj.call();
        obj.on();
        //obj.music();//not allowed
    }
}

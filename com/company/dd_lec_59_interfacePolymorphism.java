package com.company;

class CellPhone2{
    public int dailTheNO(int number){
        return 0;
    }
    public void call(){
        System.out.println("calling the friend");
    }
}

interface Music2{
    int a=55;
    void playMusic();
    void downloadMusic();
}

interface GPS2{
    String[] enterYourLocation();
    void direction();
}


class SmartPhone2 extends CellPhone2 implements Music2,GPS2{
    public void playMusic(){
        System.out.println("play my fav song");
    }
    public void downloadMusic(){
        System.out.println("Download the song from google");
    }
    public String[] enterYourLocation(){
        String[] locationList = {"bhopal","delhi","pune","Mumbai"};
        return locationList;
    }
    public  void direction(){
        System.out.println("Direction");
    }
}



public class dd_lec_59_interfacePolymorphism {
    public static void main(String[] args) {
    GPS2 g = new SmartPhone2();//smartphone2 can only act as a gps device only & cannot access different methods of smrtphone
    //g.plarMusic(); --> not allowed
       g.direction();// allowed



    }
}

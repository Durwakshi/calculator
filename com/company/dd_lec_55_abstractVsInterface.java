package com.company;

interface Bicycle1{
    int a = 34; //the properties of the interface are final
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHorn();
    void blowHornMHN();
}



class AoneCycle implements Bicycle1 , HornBicycle{
   public void applyBreak(int decrement){
       System.out.println("apply Break");
   }
   public void speedUp(int increment){
       System.out.println("speed up th speed of the bicycle");
   }
    public void blowHorn(){
        System.out.println("peep peep");
    }
    public void blowHornMHN(){
        System.out.println("POP POP");
    }
}


public class dd_lec_55_abstractVsInterface {
    public static void main(String[] args) {
        AoneCycle b = new AoneCycle();
        System.out.println(b.a);
       // b.a = 45;  //we cannot modify the properties of the interface as they are defined as final
        //System.out.println(b.a);
        b.applyBreak(1);
        b.speedUp(4);

        b.blowHorn();
        b.blowHornMHN();
        // we can use 2 interfaces in one class but we cannot use more than one abstract class to extend one class
    }
}

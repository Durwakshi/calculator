package com.company;

interface Bicycle{
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class AvonBicycle implements Bicycle{
    int speed = 3;
   public void applyBreak(int decrement){
       speed = speed - decrement;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
}



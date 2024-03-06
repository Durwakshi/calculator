package com.company;

/* abstract class Pen{
   abstract void write();
   abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Writee");
    }

    @Override
    void refill() {
        System.out.println("refill the pen");
    }
    void changeNib(){
        System.out.println("change the nibble");
    }
}*/

class Monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class HumanBeing extends Monkey implements BasicAnimal{
    public void eat(){}
    public void sleep(){}
}


public class dd_lec_60_ps11 {
    public static void main(String[] args) {
       /* FountainPen fp = new FountainPen();
        fp.changeNib();*/

        HumanBeing h = new HumanBeing();
        h.bite();

        Monkey m = new HumanBeing();
        m.jump();

    }
}

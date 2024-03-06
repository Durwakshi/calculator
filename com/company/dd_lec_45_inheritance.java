package com.company;
class Base{
    int X;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }
}
class Derived extends Base{
    int Y;

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
public class dd_lec_45_inheritance {
    public static void main(String[] args) {
       // Base b = new Base();
        //b.setX(4);
        //System.out.println(b.getX());
        Derived d = new Derived();
        d.setX(5);
        d.setY(88);
        System.out.println("the value of X is : "+d.getX());
        System.out.println("the value of y is  : "+d.getY());
    }
}

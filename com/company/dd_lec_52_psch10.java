package com.company;

class Circle{
   public int r;
    public double area(int r){
        return Math.PI*r*r;
    }
}
class Cylinder1 extends Circle{
    int h;
    public int height(int h){
        return h;
    }
}

public class dd_lec_52_psch10 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.area(5));
    }
}

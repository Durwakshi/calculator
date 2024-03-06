package com.company;


class Cylinder{
    int radius;
    int height;
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }
    /*static float area(int r,int h){
        float a=2*3.14f*h*r;
        return a;*/

    public double area(){
        return 2*3.142*radius*height;
    }

}

public class dd_lec_44_ps9 {
    public static void main(String[] args) {
        Cylinder dur = new Cylinder();
        dur.setRadius(8);
        dur.setHeight(18);
        System.out.println(dur.getRadius());
        System.out.println(dur.getHeight());
        System.out.println("area : "+dur.area() );
    }
}

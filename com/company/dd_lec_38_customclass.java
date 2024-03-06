package com.company;


class durwa{
    String name;
    int age;
    void details(){
        System.out.println("my name is : "+name);
        System.out.println("my age is : "+age);
    }

}
public class dd_lec_38_customclass {
    public static void main(String[] args) {
      durwa dhairya = new durwa();
      dhairya.name ="lakshya";
      dhairya.age=23;

      durwa dd=new durwa();
      dd.name="maya";
      dd.age =15;

      dhairya.details();
      dd.details();
    }
}

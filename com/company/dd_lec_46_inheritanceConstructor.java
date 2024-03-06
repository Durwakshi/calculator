package com.company;
class Base1{
    Base1(){
        System.out.println("i m a constructor of Base1");
    }
    Base1(int x){
        System.out.println("i am a constructor of Base1 with value of x : " +x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("i m a constructor of Derived1");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("i am a constructor of Derived1 with value of y : " +y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("i m a constructor of ChildOfDerived");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("i am a constructor of ChildOfDerived with value of z : " +z);
    }
}
public class dd_lec_46_inheritanceConstructor {
    public static void main(String[] args) {
    // Base1 b = new Base1();

      // Derived1 d = new Derived1(5,6);

        ChildOfDerived c = new ChildOfDerived(3,4,5);
    }
}

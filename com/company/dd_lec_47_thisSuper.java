package com.company;
class Class1{
    int a;

    public int getA(){
       return a;
    }
    Class1(int a){
      this.a =a;

    }
    public int none(){
        return 1;
    }
}


class Class2 extends Class1{
    Class2(int c){
        super(c);
        System.out.println("i m the constructor of Class2");
    }
}
public class dd_lec_47_thisSuper {
    public static void main(String[] args) {
      Class1 c = new Class1(2);
        System.out.println(c.getA());

      Class2 two = new Class2(9);
    }
}

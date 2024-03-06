package com.company;

class MyEmployee{
    int id;
    String name;
    public MyEmployee(){   //constructor name is same as class name in which it is defined and it does not contain any return type
     id = 23;
     name = "dhairya";
    }
    public MyEmployee(String MyName,int MyId){
        name = MyName;
        id = MyId;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class dd_lec_42_constructor {
    public static void main(String[] args) {
     MyEmployee dee = new MyEmployee();
        System.out.println(dee.getId());
        System.out.println(dee.getName());



        MyEmployee lee = new MyEmployee("bisen",45);
        System.out.println(lee.getId());
        System.out.println(lee.getName());
    }
}

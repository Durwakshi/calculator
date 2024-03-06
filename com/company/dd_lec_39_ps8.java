package com.company;


/*class Employee{
    String name;
    int salary;
    public int getSalary(){
      return salary;
    }
    public String getName(){
       return name;
    }
    public void setName(String n){
        name =n;
    }
}*/



class CellPhone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void multitask(){
        System.out.println("multitasking...");
    }
}
public class dd_lec_39_ps8 {
    public static void main(String[] args) {
       /* Employee dee = new Employee();
       // dee.name = "durr";
        dee.salary = 23;
        System.out.println(dee.getSalary());
        System.out.println(dee.getName());
        //dee.setName("deshh");
        System.out.println(dee.getName());*/


        CellPhone redmi = new CellPhone();
        redmi.ring();
        redmi.vibrate();
        redmi.multitask();
    }
}

package com.company;

public class dd_lec_32_moverloading {
    static void dee(){
        System.out.println("good morning");
    }
    static void dee(int a){
        System.out.println("good morning "+a+ " dude");
    }
    static void dee(int a,int b){
        System.out.println("good morning "+a+ " dude");
        System.out.println("good morning "+b+ " dude");
    }

    public static void main(String[] args) {
        dee();
        dee(19);
        dee(8,18);
    }
}

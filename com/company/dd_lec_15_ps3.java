package com.company;

public class dd_lec_15_ps3 {
    public static void main(String[] args) {
        // problem 1
        String sc  =  "DURWA";
        System.out.println(sc.toLowerCase());

        //problem 2
        String a = " d u r w a ";
        System.out.println(a.replace(" ", "_"));

        //problem 3
        String letter = "Dear <|durwa|>, thanks alot";
        System.out.println(letter.replace("<|durwa|>","dhairya"));

        //problem 4
        String b = "this program  contain two and  three space";
        System.out.println(b.lastIndexOf("  "));
        System.out.println(b.lastIndexOf("   "));


        // problem 5
        System.out.println(" \"Dear harry.\nThis java course is nice.\nthanks!\" ");

    }
}

package com.company;
import java.util.*;

public class dd_lec_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(9);
        l1.add(8);
        l1.add(5);
        l1.add(4);
        l1.add(0,6);
        //l1.add(0,3);

        l2.add(15);
        l2.add(16);
        l2.add(17);
        l1.addAll(0,l2);
        System.out.println(l1.contains(15));
        l1.set(2,88);
       // l1.clear();
       // l1.removeAll(l2);
        //l1.remove(2);
        for(int i = 0 ; i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }
    }

}

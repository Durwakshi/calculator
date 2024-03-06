package com.company;

import java.util.ArrayDeque;

public class dd_lec_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(9);
        ad.add(7);
        ad.add(6);
        ad.addFirst(3);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
    }
}

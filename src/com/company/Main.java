package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Random random= new Random();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int sum = 0;
        for(int i = 0; i <2; i++) {
            ArrayList<Integer> maxlist= new ArrayList<>();
            int index=0;
            for (int j = 0; j <10 ; j++) {
                index = random.nextInt(list.get(j));
            }
            sum += list.get(index);
            System.out.println(list.get(index));
        }
        System.out.println("hasil"+sum);
    }
}

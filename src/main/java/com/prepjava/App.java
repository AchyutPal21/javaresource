package com.prepjava;

import java.util.ArrayList;

import com.prepjava.dsa.recursion.MergeSortRec;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(12);
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(19);
        list.add(-1);
        MergeSortRec obj = new MergeSortRec();
        obj.sort(list);

        for (int val : list) {
            System.out.print(val + " ");
        }

    }
}
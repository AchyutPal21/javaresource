package com.prepjava;

import java.util.ArrayList;

import com.prepjava.dsa.recursion.SolvePrintSubSequence;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ArrayList<Integer> emptyList = new ArrayList<>();
        int n = list.size();
        SolvePrintSubSequence.printSubSequence(0, n, list, emptyList);

    }
}
package com.prepjava;

import java.util.ArrayList;
import java.util.List;

import com.prepjava.dsa.recursion.MergeSortRec;
import com.prepjava.dsa.recursion.QuickSortRec;
import com.prepjava.dsa.recursion.SolveCombinationSum;

public class App {
    public static void main(String[] args) {
        SolveCombinationSum obj = new SolveCombinationSum();
        List<List<Integer>> combinations = obj.combinationSum(new int[]{2,3,6,7}, 7);
        System.out.println(combinations);

    }
}
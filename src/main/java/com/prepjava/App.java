package com.prepjava;

import java.util.List;

import com.prepjava.dsa.recursion.SolveCombinationSumTwo;

public class App {
    public static void main(String[] args) {
        SolveCombinationSumTwo combinationSumTwo = new SolveCombinationSumTwo();
        // int[] candidates = new int[]{10,1,2,7,6,1,5};
        int[] candidates = new int[]{3,1,2,4};
        // int target = 8;
        int target = 5;
        List<List<Integer>> combinations = combinationSumTwo.combinationSum2(candidates, target);
        System.out.println(combinations);



    }
}


/*


      conso

 */
package com.prepjava.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SolveCombinationSum {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> combinations = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    getAllCombinations(candidates, 0, target, combinations, list);
    return combinations;
  }

  public void getAllCombinations(int[] candidates, int index, int target, List<List<Integer>> combinations, List<Integer> list) {

    if (index >= candidates.length) return;
    if (target < 0) return;

    if (target == 0) {
      List<Integer> combs = new ArrayList<>(list);
      combinations.add(combs);
      return;
    }



    // This approach will add all the index values even if the 
    // value is greater then the target and will call recursion

    // list.add(candidates[index]);
    // getAllCombinations(
    //   candidates, 
    //   index, 
    //   target - candidates[index], 
    //   combinations, 
    //   list
    // );
    // list.remove(list.size() - 1);

    // We will add only when the index value is less then 
    // or equal to the target, if we are adding we need to 
    // remove that's why we kept it in the if block

    if (candidates[index] <= target) {
      list.add(candidates[index]);
      getAllCombinations(
        candidates, 
        index, 
        target - candidates[index], 
        combinations, 
        list
      );
      list.remove(list.size() - 1);
    }

    getAllCombinations(
      candidates, 
      index + 1, 
      target, 
      combinations, 
      list
    );


  }


}

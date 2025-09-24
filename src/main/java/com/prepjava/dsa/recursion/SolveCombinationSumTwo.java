package com.prepjava.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 40. Combination Sum II
  Medium

  Given a collection of candidate numbers (candidates) and a target number (target), 
  find all unique combinations in candidates where the candidate numbers sum to target.

  Each number in candidates may only be used once in the combination.

  Note: The solution set must not contain duplicate combinations.

  Example 1:
  Input: candidates = [10,1,2,7,6,1,5], target = 8
  Output: 
    [
      [1,1,6],
      [1,2,5],
      [1,7],
      [2,6]
    ]

  Example 2:
  Input: candidates = [2,5,2,1,2], target = 5
  Output: 
    [
      [1,2,2],
      [5]
    ]

  Constraints:
    1 <= candidates.length <= 100
    1 <= candidates[i] <= 50
    1 <= target <= 30

  
*/
public class SolveCombinationSumTwo {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    // sort the list to get the combinations in the sorted order
    List<Integer> candidateList = new ArrayList<>();
    for (int num : candidates) {
        candidateList.add(num);
    }

    Collections.sort(candidateList);

    List<List<Integer>> combinationList = new ArrayList<>();
    List<Integer> combination = new ArrayList<>();

    getCombination(candidateList, 0, target, combinationList, combination);
    return combinationList;
      
  }

  public void getCombination(List<Integer> list, int index, int target, List<List<Integer>> combinationList, List<Integer> combination) {
    if (target < 0) return;

    if (target == 0) {
      combinationList.add(new ArrayList<>(combination));
      return;
    }

    int pickedItem = 0;
    for (int i = index; i < list.size(); i++) {
      if (pickedItem == 0 || pickedItem != list.get(i)) {
        pickedItem = list.get(i);
        combination.add(list.get(i));
        getCombination(list, i + 1, target-list.get(i), combinationList, combination);
        combination.remove(combination.size() - 1);
      }
    }
  }
}

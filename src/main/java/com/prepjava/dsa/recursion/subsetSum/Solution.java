package com.prepjava.dsa.recursion.subsetSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Subset sum, give all the subset sum in non-descending order
 * [3, 2, 1] => [[0], [1], [2], [3], [3], [4], [5], [6]]
 * 
 * TC: O(2^n)
 * SC: O(n)
 */

public class Solution {
  private void subsetSum(List<Integer> list, int index, int sum, List<Integer> sumList) {
    if (index >= list.size()) {
      sumList.add(sum);
      return;      
    }

    int currSum = sum + list.get(index);
    subsetSum(list, index+1, currSum, sumList);
    
    currSum = currSum - list.get(index);
    subsetSum(list, index+1, currSum, sumList);
  }

  public List<Integer> sortedSubsetSum(List<Integer> list) {
    List<Integer> sums = new ArrayList<>();
    subsetSum(list, 0, 0, sums);
    Collections.sort(sums);;
    return sums;
  }
}

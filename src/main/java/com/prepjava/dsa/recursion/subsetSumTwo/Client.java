package com.prepjava.dsa.recursion.subsetSumTwo;

import java.util.List;

public class Client {
  public static void main(String[] args) {
    Solution solution = new Solution();
    List<List<Integer>> uniqueSubset = solution.subsetsWithDup(new int[]{1,3,2});
    System.out.println(uniqueSubset);
  }
}

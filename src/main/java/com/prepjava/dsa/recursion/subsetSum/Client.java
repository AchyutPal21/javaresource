package com.prepjava.dsa.recursion.subsetSum;

import java.util.ArrayList;
import java.util.List;

public class Client {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(1);
    list.add(2);

    Solution solution = new Solution();
    List<Integer> sortedSubSetSumList = solution.sortedSubsetSum(list);
    System.out.println(sortedSubSetSumList);
  }
}

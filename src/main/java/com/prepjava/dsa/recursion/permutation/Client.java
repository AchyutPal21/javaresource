package com.prepjava.dsa.recursion.permutation;

import java.util.List;

public class Client {
public static void main(String[] args) {
  Solution solution = new Solution();
  // List<List<Integer>> ans = solution.permuteOne(new int[]{1,2,3});
  List<List<Integer>> ans = solution.permuteTwo(new int[]{1,2,3});
  System.out.println(ans);


}
}

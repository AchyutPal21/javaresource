package com.prepjava.dsa.recursion.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> permuteOne(int[] nums) {
    boolean[] frequencyMap = new boolean[nums.length];
    Arrays.fill(frequencyMap, false);
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    permutationVOne(nums, ans, list, frequencyMap);
    return ans;

  }

  private void permutationVOne(int[] nums, List<List<Integer>> ans, List<Integer> list, boolean[] frequencyMap) {

    if (list.size() == nums.length) {
      ans.add(new ArrayList<>(list));
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      if (!frequencyMap[i + 1]) {
        frequencyMap[i] = true;
        list.add(nums[i]);
        permutationVOne(nums, ans, list, frequencyMap);
        frequencyMap[i] = false;
        list.remove(list.size() - 1);
      }
    }
  }

  public List<List<Integer>> permuteTwo(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    permutationVTwo(0, nums, ans);
    return ans;
  }

  private void permutationVTwo(int index, int[] nums, List<List<Integer>> ans) {
    if (index == nums.length) {
      List<Integer> ds = new ArrayList<>();
      for (int num : nums) {
        ds.add(num);
      }

      ans.add(ds);
      return;
    }

    for (int i = index; i < nums.length; i++) {
      this.swap(nums, index, i);
      this.permutationVTwo(index + 1, nums, ans);
      this.swap(nums, index, i);
    }

  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}

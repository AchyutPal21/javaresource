package com.prepjava.dsa.recursion.subsetSumTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 90. Subsets II
 * -----------------------------
 * Given an integer array nums that may contain duplicates, 
 * return all possible unique subsets (the power set).
 * 
 * Each subset must be unique, meaning no duplicate subsets should appear.
 * 
 * Example 1:
 * Input: nums = [1,2,2]
 * Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 * 
 * Example 2:
 * Input: nums = [0]
 * Output: [[],[0]]
 * 
 * Constraints:
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 */

public class Solution {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    // Final list to store all unique subsets
    List<List<Integer>> subsets = new ArrayList<>();
    // Temporary list to build each subset
    List<Integer> currentSubset = new ArrayList<>();

    // Sort the array so duplicates are adjacent — this is crucial for skipping
    // duplicates
    Arrays.sort(nums);

    // Start backtracking from index 0
    getUniqueSubset(nums, 0, subsets, currentSubset);

    return subsets;
  }

  private void getUniqueSubset(int[] nums, int index, List<List<Integer>> subsets, List<Integer> current) {

    // Add a copy of the current subset to the result list
    subsets.add(new ArrayList<>(current));

    // Explore further elements starting from the current index
    for (int i = index; i < nums.length; i++) {

      // Skip duplicate elements at the same recursion depth
      if (i != index && nums[i] == nums[i - 1]) {
        continue;
      }

      // Include the current element
      current.add(nums[i]);

      // Recurse to build subsets including this element, move to the next index
      getUniqueSubset(nums, i + 1, subsets, current);

      // Backtrack — remove the last element to explore other subsets
      current.remove(current.size() - 1);
    }
  }
}

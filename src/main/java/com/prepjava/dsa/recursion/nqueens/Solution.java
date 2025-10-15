package com.prepjava.dsa.recursion.nqueens;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  // These three methods are using extra space
  public List<List<String>> solveNQueens(int n) {
    List<List<Integer>> board = new ArrayList<>();
    List<List<String>> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      List<Integer> col = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        col.add(0);
      }
      board.add(col);
    }
    solutionOne(n, 0, ans, board);
    return ans;
  }

  private void solutionOne(int n, int col, List<List<String>> ans, List<List<Integer>> board) {
    if (col == n) {
      List<String> pos = new ArrayList<String>();
      for (List<Integer> row : board) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int pice : row) {
          if (pice == 1) {
            stringBuilder.append("Q");
          } else {
            stringBuilder.append(".");
          }
        }
        pos.add(stringBuilder.toString());
      }
      
      ans.add(pos);
      
      return;
    }

    for (int row = 0; row < n; row++) {
      if (!isQueenSafe(n, row, col, board)) {
        continue;
      }

      board.get(row).set(col, 1);
      solutionOne(n, col+1, ans, board);
      board.get(row).set(col, 0);
    }
  }

  private boolean isQueenSafe(int n, int row, int col, List<List<Integer>> board) {
    int r = row;
    int c = col;

    // top-left diagonal direction
    while (r >= 0 && c >= 0) {
      if (1 == board.get(r).get(c)) {
        return false;
      }

      r--;
      c--;
    }

    // left direction
    r = row;
    c = col;
    while (c >= 0) {
      if (1 == board.get(r).get(c)) {
        return false;
      }
      c--;
    }

    // bottom-left diagonal direction
    r = row;
    c = col;
    while (r < n && c >= 0) {
      if (1 == board.get(r).get(c)) {
        return false;
      }

      r++;
      c--;
    }

    return true;
  }

}

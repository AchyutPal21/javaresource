package com.prepjava.dsa.recursion.nqueens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionHash {
  private boolean[] leftHash;
  private boolean[] upperLeftDiagonalHash;
  private boolean[] bottomLeftDiagonalHash;

  public List<List<String>> solveNQueens(int n) {
    // Initialized
    this.initializedHash(n);
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
      if (hasInUpperLeftDiagonal(n, row, col)
          || hasInLeftDirection(row)
          || hasInBottomLeftDiagonal(row, col)) {
        continue;
      }

      // Set the Queen
      board.get(row).set(col, 1);
      setInUpperLeftDiagonal(n, row, col);
      setInLeftDirection(row);
      setInBottomLeftDiagonal(row, col);
      // Make recursive call
      solutionOne(n, col + 1, ans, board);
      // Remove the Queen
      board.get(row).set(col, 0);
      removeInUpperLeftDiagonal(n, row, col);
      removeInLeftDirection(row);
      removeInBottomLeftDiagonal(row, col);
    }
  }

  private void initializedHash(int n) {
    this.leftHash = new boolean[n];
    this.upperLeftDiagonalHash = new boolean[((2 * n) - 1)];
    this.bottomLeftDiagonalHash = new boolean[((2 * n) - 1)];

    Arrays.fill(leftHash, false);
    Arrays.fill(upperLeftDiagonalHash, false);
    Arrays.fill(bottomLeftDiagonalHash, false);
  }

  // Left Side Queen
  private boolean hasInLeftDirection(int row) {
    return this.leftHash[row];
  }

  private void setInLeftDirection(int row) {
    this.leftHash[row] = true;
  }

  private void removeInLeftDirection(int row) {
    this.leftHash[row] = false;
  }

  // Upper Left Diagonal Queen
  private boolean hasInUpperLeftDiagonal(int n, int row, int col) {
    return this.upperLeftDiagonalHash[(n - 1) + (col - row)];
  }

  private void setInUpperLeftDiagonal(int n, int row, int col) {
    this.upperLeftDiagonalHash[(n - 1) + (col - row)] = true;
  }

  private void removeInUpperLeftDiagonal(int n, int row, int col) {
    this.upperLeftDiagonalHash[(n - 1) + (col - row)] = false;
  }

  // Bottom Left Diagonal Queen
  private boolean hasInBottomLeftDiagonal(int row, int col) {
    return this.bottomLeftDiagonalHash[row + col];
  }

  private void setInBottomLeftDiagonal(int row, int col) {
    this.bottomLeftDiagonalHash[row + col] = true;
  }

  private void removeInBottomLeftDiagonal(int row, int col) {
    this.bottomLeftDiagonalHash[row + col] = false;
  }

}

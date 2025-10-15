package com.prepjava.dsa.recursion.nqueens;

import java.util.List;

public class Client {
  public static void main(String[] args) {
    SolutionHash solution = new SolutionHash();
    List<List<String>> board = solution.solveNQueens(4);
    System.out.println(board);
  }
}

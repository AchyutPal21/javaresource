
package com.prepjava.dsa.recursion;

import java.util.ArrayList;

public class SolvePrintSubSequence {
  public static void printSubSequence(int index, int n, ArrayList<Integer> list, ArrayList<Integer> emptyList) {

    if (index >= n) {
      System.out.print("[ ");
      for (int num : emptyList) {
        System.out.print(num + " ");
      }
      System.out.println("]");
      return;
    }


    emptyList.add(list.get(index));
    printSubSequence(index + 1, n, list, emptyList);

    emptyList.remove(emptyList.size() - 1);
    printSubSequence(index + 1, n, list, emptyList);
  }

}

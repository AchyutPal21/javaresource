package com.prepjava.dsa.recursion;

import java.util.ArrayList;

public class QuickSortRec {
  private void swap(ArrayList<Integer> list, int i, int j) {
    int temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
  }
  private int partition(ArrayList<Integer> list, int low, int high) {
    
    int pivot = list.get(low);
    int i = low;
    int j = high;
    while (i < j) {

      while (i <= high && list.get(i) <= pivot) i++;
      while(j >= low && list.get(j) > pivot) j--;

      // swap b/w ith & jth index
      if (i < j) {
        swap(list, i, j);
      }
    }

    // swap the pivot correct position
    swap(list, low, j);
    
    return j;
  }

  private void quickSort(ArrayList<Integer> list, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(list, low, high);
      System.out.println(pivotIndex);
      quickSort(list, low, pivotIndex - 1);
      quickSort(list, pivotIndex + 1, high);
    }
  }

  public void sort(ArrayList<Integer> list) {
    int low = 0;
    int high = list.size() - 1;
    quickSort(list, low, high);
  }
}

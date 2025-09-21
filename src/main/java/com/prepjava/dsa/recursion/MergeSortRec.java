package com.prepjava.dsa.recursion;

import java.util.ArrayList;

public class MergeSortRec {
  private void mergeList(ArrayList<Integer> list, int low, int mid, int high) {

    int i = low;
    int j = mid + 1;
    ArrayList<Integer> tempList = new ArrayList<>();

    while (i <= mid && j <= high) {
      if (list.get(i) <= list.get(j)) {
        tempList.add(list.get(i));
        i++;
      } else {
        tempList.add(list.get(j));
        j++;
      }
    }

    while (i <= mid) {
      tempList.add(list.get(i));
      i++;
    }

    while (j <= high) {
      tempList.add(list.get(j));
      j++;
    }

    for (int k = low; k <= high; k++) {
      list.set(k, tempList.get(k - low));
    }
  }

  private void mergeSort(ArrayList<Integer> list, int low, int high) {
    int mid = low + ((high - low) >> 1);

    if (low >= high) return;
    mergeSort(list, low, mid);
    mergeSort(list, mid + 1, high);
    mergeList(list, low, mid, high);
  }

  public void sort(ArrayList<Integer> list) {
    mergeSort(list, 0, list.size() - 1);
  }
}

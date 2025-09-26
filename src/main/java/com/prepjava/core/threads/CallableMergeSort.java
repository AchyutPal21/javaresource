package com.prepjava.core.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class CallableMergeSort implements Callable<List<Integer>> {

  private List<Integer> list;
  private ExecutorService executorService;

  public CallableMergeSort(List<Integer> list, ExecutorService executorService) {
    this.list = list;
    this.executorService = executorService;
  }

  public List<Integer> getSortedList() {
    return this.list;
  }

  @Override
  public List<Integer> call() throws Exception {
    if (this.list.size() == 1) return this.list;
    int mid = this.list.size() / 2;
    
    List<Integer> leftSideList = new ArrayList<>();
    for (int i = 0; i < mid; i++) {
      leftSideList.add(list.get(i));
    }
    CallableMergeSort leftHalf = new CallableMergeSort(leftSideList, this.executorService);

    List<Integer> rightSideList = new ArrayList<>();
    for (int i = mid; i < this.list.size(); i++) {
      rightSideList.add(list.get(i));
    }
    CallableMergeSort rightHalf = new CallableMergeSort(rightSideList, this.executorService);

    // Call the left and right half list
    // List<Integer> leftList = leftHalf.call();
    // List<Integer> rightList = rightHalf.call();
    Future<List<Integer>> leftFutureList = this.executorService.submit(leftHalf);
    Future<List<Integer>> rightFutureList = this.executorService.submit(rightHalf);
    
    List<Integer> leftList = leftFutureList.get();
    List<Integer> rightList = rightFutureList.get();

    // Now merge the list
    List<Integer> mergeList = new ArrayList<>();
    int l = 0;
    int r = 0;
    while (l < leftList.size() && r < rightList.size()) {
      if (leftList.get(l) <= rightList.get(r)) {
        mergeList.add(leftList.get(l));
        l++;
      } else {
        mergeList.add(rightList.get(r));
        r++;
      }
    }

    while (l < leftList.size()) {
      mergeList.add(leftList.get(l));
      l++;
    }

    while (r < rightList.size()) {
      mergeList.add(rightList.get(r));
      r++;
    }

    return mergeList;

  }
}

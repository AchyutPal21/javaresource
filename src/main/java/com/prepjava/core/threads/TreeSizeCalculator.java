package com.prepjava.core.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
  private Node node;
  private ExecutorService executorService;

  public TreeSizeCalculator(Node node, ExecutorService executorService) {
    this.node = node;
    this.executorService = executorService;
  }

  @Override
  public Integer call() throws Exception {
    if (this.node == null) {
      return 0;
    }

    TreeSizeCalculator leftTreeSizeCalculator;
    Future<Integer> leftCount = null;
    if (this.node.left != null) {
      leftTreeSizeCalculator = new TreeSizeCalculator(this.node.left, this.executorService);
      leftCount = this.executorService.submit(leftTreeSizeCalculator);
    }


    TreeSizeCalculator rightTreeSizeCalculator;
    Future<Integer> rightCount = null;
    if (this.node.right != null) {
      rightTreeSizeCalculator = new TreeSizeCalculator(this.node.right, this.executorService);
      rightCount = this.executorService.submit(rightTreeSizeCalculator);
    }

    int count = 0;

    if (leftCount != null) {
      count += leftCount.get().intValue();
    }

    if (rightCount != null) {
      count += rightCount.get().intValue();
    }


    return count + 1;
  }
}

package com.prepjava.core.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
  public static void main(String[] args) {
    Node first = new Node();
    Node second = new Node();
    Node third = new Node();
    Node fourth = new Node();
    Node fifth = new Node();

    first.left = second;
    first.right = third;
    first.data = 10;

    second.left = fourth;
    second.right = fifth;
    second.data = 20;

    third.left = null;
    third.right = null;
    third.data = 30;

    fourth.left = null;
    fourth.right = null;
    fourth.data = 40;

    fifth.left = null;
    fifth.right = null;
    fifth.data = 50;

    ExecutorService executorService = Executors.newCachedThreadPool();
    TreeSizeCalculator treeSizeCalculator = new TreeSizeCalculator(first, executorService);

    try {
      Future<Integer> treeSize = executorService.submit(treeSizeCalculator);
      int size = treeSize.get().intValue();
      System.out.println("Tree Size: " + size);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      executorService.shutdown();
    }

    System.out.println("Finished counting the tree size calculating");

  }
}

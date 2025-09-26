package com.prepjava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.prepjava.core.threads.CallableMergeSort;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(0);
        list.add(2);
        ExecutorService executorService = Executors.newCachedThreadPool();
        CallableMergeSort sort = new CallableMergeSort(list, executorService);

        try {
            // List<Integer> sortedList = sort.call();
            Future<List<Integer>> sortedFuture = executorService.submit(sort);
            System.out.println("Object Sorted list: " + sortedFuture.get());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executorService.shutdown();
        }
    }
}
package MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> list;
    ExecutorService executors;
    public MergeSorter(List<Integer> list,ExecutorService executors) {
        this.list = list;
        this.executors = executors;
    }

    @Override
    public List<Integer> call() throws Exception {
        //logic to implement merge sort using multithreading

        if(list.size() <= 1)
        {
            return list;
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int mid = list.size()/2;
        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }
        for(int i=mid;i<list.size();i++)
        {
            right.add(list.get(i));
        }
        //ExecutorService executorServiceleft = Executors.newCachedThreadPool();
        MergeSorter mergeSorterleft = new MergeSorter(left,executors);

        //Futures represent the result of an asynchronous computation, and provide
        // methods to check if the computation is complete, wait for it to finish,
        // and retrieve the result. For example, the get() method blocks execution
        // until the task is complete, but this shouldn't be an issue if the method
        // is only called after ensuring the task is finished.

        Future<List<Integer>> leftSortedFuture = executors.submit(mergeSorterleft);

        //ExecutorService executorServiceRight = Executors.newCachedThreadPool();
        MergeSorter mergeSorterRight = new MergeSorter(right,executors);
        Future<List<Integer>> rightSortedFuture = executors.submit(mergeSorterRight);


        List<Integer> leftSorted  = leftSortedFuture.get();
        List<Integer> rightSorted = rightSortedFuture.get();


        List<Integer> sortedList = new ArrayList<>();

        int i=0, j=0;

        while(i < left.size() && j < right.size())
        {
            if(left.get(i) < right.get(i))
            {
                sortedList.add(left.get(i));
            }
            else
            {
                sortedList.add(right.get(i));
            }
        }

        while(i < left.size())
        {
            sortedList.add(left.get(i));
        }

        while(j < right.size())
        {
            sortedList.add(right.get(i));
        }

        return sortedList;
    }
}

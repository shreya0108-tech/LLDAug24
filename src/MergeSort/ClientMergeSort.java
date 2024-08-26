package MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ClientMergeSort {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(2,3,1,6,4,7,9,8);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(arr,executorService);
        Future<List<Integer>> outFuture = executorService.submit(mergeSorter);
        List<Integer> output = outFuture.get();
        System.out.println(output);
    }
}
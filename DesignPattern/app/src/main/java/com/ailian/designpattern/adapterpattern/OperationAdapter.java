package com.ailian.designpattern.adapterpattern;

/**
 * Created by Ailian on 17/1/17.
 */

public class OperationAdapter implements SorceOperation {

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public OperationAdapter() {
        this.quickSort = new QuickSort();
        this.binarySearch = new BinarySearch();
    }


    @Override
    public int[] sort(int[] array) {
        return quickSort.sort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.search(array, key);
    }
}

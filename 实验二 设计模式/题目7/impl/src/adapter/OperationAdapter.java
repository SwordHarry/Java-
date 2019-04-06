package adapter;

import operation.BinarySearch;
import operation.DataOperation;
import operation.QuickSort;

public class OperationAdapter implements DataOperation {

   private QuickSort quickSort;

   private BinarySearch binarySearch;

   public OperationAdapter(){
      quickSort = new QuickSort();
      binarySearch = new BinarySearch();
   }

   public void sort(int[] arr) {

      quickSort.quickSort(arr);
   }

   public int search(int[] arr, int goal) {

      return binarySearch.binarySearch(arr,goal);
   }

}
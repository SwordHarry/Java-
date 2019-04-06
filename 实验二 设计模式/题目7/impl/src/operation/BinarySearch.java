package operation;

public class BinarySearch {

   // 传进来的数组默认从小到大排序
   public int binarySearch(int[] arr, int goal) {
      int low = 0;
      int high = arr.length - 1;
      int middle = 0;

      if(goal < arr[low] || goal > arr[high]){
         return -1;
      }

      while(low <= high){
         middle = (low + high) / 2;
         if(arr[middle] > goal){
            high = middle - 1;
         }else if(arr[middle] < goal) {
            low = middle + 1;
         }else {
            return middle;
         }
      }

      return -1;
   }

}
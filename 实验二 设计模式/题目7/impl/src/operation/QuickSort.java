package operation;

public class QuickSort {

   public void quickSort(int[] arr) {

      entryForQuickSory(arr,0,arr.length - 1);
   }

   private void entryForQuickSory(int[] arr,int p,int r) {
      if(p < r) {
         int q = Partition(arr,p,r);
         entryForQuickSory(arr,p,q - 1); // 对左半端排序
         entryForQuickSory(arr,q + 1,r); // 对右半段排序
      }
   }

   private int Partition(int[] arr, int p, int r) {
      int i = p,j = r + 1;
      int x = arr[i];
      // 将 < x 的元素交换到左边
      // 将 > x 的元素交换到右边
      while (true) {
         while (arr[++i] < x && i < r);
         while (arr[--j] > x);
         if(i >= j) break;
         Swap(arr,i,j);
      }
      arr[p] = arr[j];
      arr[j] = x;
      return j;
   }

   private void Swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }


}
public class Match {  //Quick sort 

   public static void quickSort(int [] arr, int low, int high) {
      if (low < high) {
         //pivot seçelim
         int pi = partition(arr, low, high);

         //sağ ve sol
         quickSort(arr, low, pi-1);
         quickSort(arr, pi+1, high);
      }
   }

   public static int partition(int [] arr, int low, int high) {
      int pivot = arr[high];
      int i = low-1;

      for (int j = low; j < high; j++) {
         if (arr[j] < pivot) {
            i++;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }
      }

      int temp = arr[i+1];
      arr[i+1] = arr[high];
      arr[high] = temp;
      return i+1;
   }

   public static void main(String[] args) {
      int[] arr = {10, 7, 8, 9, 1, 5, 4, 89,0};
      int n = arr.length;
      quickSort(arr, 0, n - 1);
      System.out.println("Sıralanmış dizi:");
      for (int i = 0; i < n; ++i) {
         System.out.print(arr[i] + " ");
      }
   }
}

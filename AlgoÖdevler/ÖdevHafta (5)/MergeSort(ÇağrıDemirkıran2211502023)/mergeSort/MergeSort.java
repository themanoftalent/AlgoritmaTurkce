package mergeSort;
import java.util.Arrays;
//Çağrı Demirkıran 2211502023
public class MergeSort {
    static void merge(int[]arr,int left,int middle,int right) {
        // Sol ve Sağ dizilerin boyutlarını ayarladık.
        int n1 = middle - left + 1;
        int n2 = right - middle;
        // Sol ve Sağ dizi için yeni diziler tanımladık.
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        // Yeni dizilerimizin girdilerini döngü ile yapıyoruz.
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left+i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle+1+j];
        }
        //
        int i = 0, j = 0;
        int templeft = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] < rightArray[j]) {
                arr[templeft] = leftArray[i];
                i++;
            } else {
                arr[templeft] = rightArray[j];
                j++;
            }
            templeft++;
        }
        // Dizin artan kısmını yazdırırız.
        while (i<n1){
            arr[templeft] = leftArray[i];
            i++;
            templeft++;
        }
        while (j<n2){
            arr[templeft] = rightArray[j];
            j++;
            templeft++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if (left<right){
            int mid = (left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
}

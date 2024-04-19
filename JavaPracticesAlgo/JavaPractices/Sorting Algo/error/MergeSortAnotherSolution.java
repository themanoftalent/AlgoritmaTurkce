package Week6;

import java.util.Arrays;

public class MergeSortAnotherSolution {
    public static void mergeSort (int[] arr) {

        if(arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr,0,temp,arr.length - 1);
    }

    private static void mergeSort(int[] arr,int left,int[] temp,int right) {
        if(left<right) {
            int mid = left + (right - left)/2;
            mergeSort(arr,left,temp,mid);
            mergeSort(arr,mid +1,temp,right);
            birlestir(arr,left,temp,right,mid);
        }
    }

    private static void birlestir(int[] arr,int left,int[] temp,int right,int mid) {
        for(int i = left; i<=right;i++) {
            temp[i] = arr[i];
        }
//-----------------Birleştirme İşlemi -------------------------
        int i = left;       //ilk index
        int j = mid + 1;
        int k = left;      //elde edilen sonuç

        while(i <= mid && j<= right) {
            if(temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,2,3,4,8,6,9,11,13,1,5};
        System.out.println("Listemiz : " + Arrays.toString(arr));

        mergeSort(arr);
        System.out.println("Sıralanmış dizi : " + Arrays.toString(arr));
    }
}

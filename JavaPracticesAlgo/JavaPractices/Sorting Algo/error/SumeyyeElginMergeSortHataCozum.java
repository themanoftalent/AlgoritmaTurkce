package hafta6;

public class SumeyyeElginMergeSortHataCozum {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int[] temp = new int[arr.length]; //geçici dizi oluşturduk ki geçici olarak içine sayıları atabilelim.

        mergeSort(arr, temp, 0, arr.length - 1); //arr.lenght - 1 olduğunda duracak, 0 başlangıç indexi
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp,  mid + 1, right);
            merge(arr, temp, left, right, mid);
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int right, int mid) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        //birlestirme
        int i = left; int j = mid + 1; int k = left; //i ilk index, k elde edilen sonuç ynai yeni olşan arrayde gezmek için

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }

        while (j <= right) {
            arr[k] = temp[j];
            k++;
            j++;
        }
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[]  arr = {11, 14, 2, 6, 7, 9, 2, 4};

        System.out.println("listemiz: ");
        print(arr);

        mergeSort(arr);
        System.out.println();

        System.out.println("sıralanmış dizi: ");
        print(arr);
    }
}

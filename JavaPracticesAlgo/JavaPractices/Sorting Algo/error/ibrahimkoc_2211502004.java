
class Main {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);

    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {

            int mid = left + (right - left) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            birlestir(arr, temp, left, right, mid); //Hata eklendi
        }


    }

    private static void birlestir(int[] arr, int[] temp, int left, int right, int mid) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];

        }


        int i = left; //ilk index
        int j = mid + 1;
        int k = left; //elde edilen sonuc

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
            arr[k] = temp[i]; //?
            k++;
            i++;


        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 14, 2, 6, 7, 9, 2, 4};
        System.out.println("Listemiz" + java.util.Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("siralanmis dizi"+ java.util.Arrays.toString(arr));
    }
}


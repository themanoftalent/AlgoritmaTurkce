package Week5;

class MergeSort {

    void Merge(int arr[], int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            LeftArray[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            RightArray[j] = arr[middle + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = LeftArray[i];   //LeftArrayde kalan elementler varsa diziye ekliyoruz.
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = RightArray[j];       //RightArrayde kalan elementler varsa diziye ekliyoruz.
            j++;
            k++;
        }
    }

    void Sort(int arr[], int left, int right) {
        if (left < right) {

            int middle = (left + right) / 2;

            Sort(arr, left, middle);
            Sort(arr, middle + 1, right);    //Böldüğümüz iki yarıyı sort methoduna sokuyoruz.

            Merge(arr, left, middle, right);
        }
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Verilen Dizi: ");
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        MergeSort mergeSort = new MergeSort();
        mergeSort.Sort(arr, 0, arr.length - 1);

        System.out.println("\nMerge Sort Uygulanmış Dizi: ");
        int m = arr.length;
        for (int i = 0; i < m; ++i)
            System.out.print(arr[i] + " ");
    }
}


package ddsdfa;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, helper, low, mid); 
            mergeSort(arr, helper, mid + 1, high); 
            merge(arr, helper, low, mid, high); 
        }
    }

    private static void merge(int[] arr, int[] helper, int low, int mid, int high) {
        
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }

        int helperLeft = low;
        int helperRight = mid + 1;
        int current = low;

        
        while (helperLeft <= mid && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                arr[current] = helper[helperLeft];
                helperLeft++;
            } else {
                arr[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        
        int remaining = mid - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[helperLeft + i];
        }
    }

    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(arr);
        System.out.print("Sıralanmış dizi: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}




package Week5;


class MergeSort {

    void Merge(int arr[], int left, int middle, int right)
    {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        //Geçici alt diziler oluştur ve verileri kopyala
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];


        //Verileri geçici dizilere kopyala(alt dizileri oluştur)
        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[middle + 1 + j];

        // İki alt diziyi birleştir ve ana diziyi sırala

        // İndeksleri başlat (ilk alt dizi için i, ikinci alt dizi için j)

        int i = 0, j = 0;

        // Birleştirme işlemi için ana dizinin indeksi

        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];   //LeftArrayde kalan elementler varsa diziye ekliyoruz.
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];       //RightArrayde kalan elementler varsa diziye ekliyoruz.
            j++;
            k++;
        }
    }

    void Sort(int arr[], int left, int right)
    {
        if (left < right) {

            int middle = (left + right) / 2;

            Sort(arr, left, middle);
            Sort(arr, middle + 1, right);    //Böldüğümüz iki yarıyı sort methoduna sokuyoruz.

            Merge(arr, left, middle, right);
        }
    }

    public static void main(String args[])
    {
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
                                                                      //Yağız Zorlu 2311502270
}


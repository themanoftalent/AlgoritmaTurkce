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





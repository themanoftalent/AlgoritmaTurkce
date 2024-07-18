import java.util.Arrays;
//Muhammed Nebi Altın 2311502278
public class Muhammed_Nebi_Altın_MergeSort {

    static void mergeSort(int[] A){
        int length = A.length;

        if (length <= 1) return;

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;

        for (; i < length; i++){
            if (i < middle){
                leftArray[i] = A[i];
            }
            else{
                rightArray[j] = A[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(A, leftArray, rightArray);
    }

    static void merge(int[] A, int[] leftArray, int[] rightArray) {
        int leftSize = A.length/2;
        int rightSize = A.length - leftSize;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                A[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                A[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize){
            A[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            A[i] = rightArray[r];
            i++;
            r++;
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,5,4,6,2,7,1,8,9,0};

        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

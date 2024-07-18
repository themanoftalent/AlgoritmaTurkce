package Week8;

import java.util.Arrays;
import java.util.Random;

public class YağızZorluMonkeySort {
    public static void main(String[] args) {
        int[] arr = {5,6,2,1,9,25,3,56,78,9632};
        System.out.println("Sıralı Liste : " + Arrays.toString(arr));
        long startTime = System.nanoTime();
        monkeySort(arr);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 10000 ;
        System.out.println("Sıralanmış Liste : " + Arrays.toString(arr));
        System.out.println("Zamanlama = " + duration + " nano saniye");
    }

    public static void monkeySort(int[] arr) {
        Random random = new Random();
        int uzunluk = arr.length;

        while(isSorted(arr)) {
            int index1 = random.nextInt(uzunluk);
            int index2 = random.nextInt(uzunluk);

            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}


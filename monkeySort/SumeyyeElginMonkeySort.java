package hafta9;

import java.util.*;
public class SumeyyeElginMonkeySort {
    static Random random = new Random();
    public static void monkeySort(int[] array) {
        while(!isSorted(array)) {
            randomSwap(array);
        }
    }

     public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
     }

     public static void randomSwap(int[] array) {
        int length = (array.length - 1);
        int randomIndex1 = random.nextInt(length);
        int randomIndex2 = random.nextInt(length);
        int temp = array[randomIndex1];
        array[randomIndex1] = array[randomIndex2];
        array[randomIndex2] = temp;
     }

    public static void main(String[] args) {
        int[] array = {5, 6, 2, 1, 9, 25, 3, 56, 5, 48, 12, 4, 99};

        System.out.println("sıralanmadan önceki dizimiz: " + Arrays.toString(array));

        long startTime = System.currentTimeMillis();

        monkeySort(array);

        //long endTime = System.currentTimeMillis();

        //double duration = (double)(endTime - startTime ) / 1000;


        System.out.println("monkey sort ile sıralanmış hali: " + Arrays.toString(array));
        //System.out.println("algo süresi: " + duration);

    }
}

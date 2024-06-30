// 2211502039 AYŞEGÜL UÇAR
import java.util.Arrays;
import java.util.Random;

public class MonkeySort {
    public static void main(String[] args) {
        int [] arr = {5, 6, 2, 1, 9, 25, 3, 56};
        System.out.println("Sıralanacak Liste: " + Arrays.toString(arr));
        monkeySort(arr);
        System.out.println("Sıralanmış Liste: " + Arrays.toString(arr));
    }

    public static void monkeySort(int [] arr) {
        Random rand = new Random();
        int uzunluk = arr.length;

        while (!isSorted(arr)) {
            for (int i = 0; i < arr.length; i++) {
                int index1 = rand.nextInt(uzunluk);
                int index2 = rand.nextInt(uzunluk);

                // Yer değiştirme
                int temp = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = temp;
            }
        }
    }

    public static boolean isSorted(int [] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

package hafta9;

import java.util.Arrays;
import java.util.Random;

public class SumeyyeElginMonkeySortError {
    public static void main(String[] args) {
        //sıralacak dizi

        int [] arr = {5,6,2,1,9,25,3,56};

        long startTime = System.nanoTime();

        monkeySort(arr); //1: fonk çağrıldı

        long endTime = System.nanoTime();

        long duration = (endTime - startTime ) / 1000;

        System.out.println("Sıralı Liste" + Arrays.toString(arr));
        System.out.println("algo süresi: " + duration);




    }
    //Normal bir fonskiyon oluştur

    public static void monkeySort(int [] arr) {        //2: void eklendi
        Random rand = new Random(); //random nesnesi yaratıldı
        int uzunluk = arr.length;   // liste uzunluğu elde edildi

        while (isSorted(arr)) {
            int index1 = rand.nextInt(uzunluk);
            int index2 = rand.nextInt(uzunluk);

            //yer değiştirm
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        }


    }

    public static boolean isSorted(int [] arr) { //3: boolean olarak tanımladık
        int uzunluk = arr.length; //4: uzunluğu tanımladık
        for(int i = 0; i< uzunluk -1; i++) {
            if(arr[i] > arr[i+1]) {
                return true;

            }
        }
        return false;
    }
}

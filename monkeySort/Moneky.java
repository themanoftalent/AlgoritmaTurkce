//array
//random 
import java.util.Arrays;
import java.util.Random;

public class MonkeySort {
    public static void main(String[] args) {
        //sıralacak dizi

        int [] arr = {5,6,2,1,9,25,3,56};

        System.out.println("Sıralı Liste" + Arrays.toString(arr));



    }
    //Normal bir fonskiyon oluştur
    monkeySort(int [] arr) {        //bu bir fonksiyon
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

    isSorted(int [] arr) {
        for(int i = 0; i< uzunluk -1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;

            }
        }
        return true;
    }
    
}

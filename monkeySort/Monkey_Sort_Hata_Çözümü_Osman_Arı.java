//Monkey-Sort Hata Çözümü

 
import java.util.Arrays;
import java.util.Random;

public class MonkeySort {                                        //Osman Arı 2211502018
    public static void main(String[] args) {
        //sıralanacak dizi

        int[] arr = {5,6,2,1,9,25,3,56};

        monkeySort(arr);                 // -------> psvm içerisinde monkeySort fonksiyonu çağrılır.

        System.out.println("Sıralı Liste" + Arrays.toString(arr));


    }

    //Normal bir fonskiyon oluştur
   public static void monkeySort(int [] arr) {        //bu bir fonksiyon        --------------> fonksiyonun tanımlanması doğru yapılmalı (" public static void" ile)
        Random rand = new Random(); //random nesnesi yaratıldı
          int uzunluk = arr.length;   // liste uzunluğu elde edildi

        while (!isSorted(arr)) {                     // ---------> "isSorted" başına "!" eklenerek fonksiyon sonucu "false" olduğu müddetçe while döngüsünün çalışması sağlanır.
            int index1 = rand.nextInt(uzunluk);     //                                                 ("false" sonucu,dizinin sıralanamadığı anlamına geir)
            int index2 = rand.nextInt(uzunluk);

            //yer değiştirme
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        }

    }
         public static boolean isSorted(int [] arr) {        //--------> fonksiyonun döndüreceği sonuçlar "true-false" olduğundan fonksiyona "public static boolean" ifadesi eklenmeli.
        for(int i =0; i<arr.length-1; i++) {                //--------> "uzunluk" değişkeni monkeySort fonksiyonunda tanımlı olduğu için burada kullanılamaz.
            if(arr[i] > arr[i+1]) {                        // "uzunluk-1" yerine "arr.length-1" ifadesi getirilirse buradaki sorun çözülür.
                return false;
            }
        }
        return true;
    }

}

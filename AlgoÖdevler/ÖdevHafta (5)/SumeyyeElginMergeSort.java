import java.util.Random;

public class SumeyyeElginMergeSort {
    // Birleştirme işlemi yapalım
    public static void mergeSort(int[] array) { //arrayleri sürekli ikiye bölmesi için olan metod
        // İki alt dizi için boyutları hesapla sonra alt dizileri oluştur
        int arrayLength = array.length;
        int mid = arrayLength / 2;

        //tek elemanlıysa birleştirme işlemine başlamak için
        if (arrayLength < 2) {
            return;
        }

        // Geçici alt diziler oluşturmalıyız ve verileri kopyalamalıyız
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arrayLength - mid];

        // Verileri geçici dizilere kopyala (alt dizileri oluştur)
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        for (int i = mid; i < arrayLength; i++) {
            rightArray[i - mid] = array[i];
        }

        //burada recursive biçimde tekrar tekrar arrayleri böl
        mergeSort(leftArray);
        mergeSort(rightArray);

        //bölünen arrayleri sırala
        merge(array, leftArray, rightArray);
    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray) { //sıralama ve birleştirme için ayrı bir metod oluşturdum
        int n1 = leftArray.length;
        int n2 = rightArray.length;
        // İki alt diziyi birleştir ve ana diziyi sırala

        // İndeksleri başlat (ilk alt dizi için i, ikinci alt dizi için j)
        int i = 0, j = 0;

        // Birleştirme işlemi için ana dizinin indeksi
        int k = 0;


        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Kalan elemanları kopyala bu durumda bir alt dizide kalan elemanlar olabilir
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray (int[] array){ //ekrana yazdırabilmek için printArray metodu oluşturdum
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) { //çalıştırabilmek için main metodunu çağırmalıyız
        Random rand = new Random();
        int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
        }

        System.out.println("dizinin merge sort algoritmasından önceki durumu:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\ndizinin merge sort algoritmasından sonraki durumu:");
        printArray(numbers);


    }
}
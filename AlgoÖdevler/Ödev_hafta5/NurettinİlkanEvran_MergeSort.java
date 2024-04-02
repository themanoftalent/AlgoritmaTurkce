//Nurettin İlkan Evran
public class NurettinİlkanEvran_MergeSort {
    // Birleştirme işlemi yapalım
    void merge(int[] array, int left, int middle, int right) {
        // İki alt dizi için boyutları hesapla sonra alt dizileri oluştur
        int n1 = middle - left + 1;
        int n2 = right - middle;


        // Geçici alt diziler oluşturmalıyız ve verileri kopyalamalıyız
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Verileri geçici dizilere kopyala (alt dizileri oluştur)
        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[middle + 1 + j];

        // İki alt diziyi birleştir ve ana diziyi sırala

        // İndeksleri başlat (ilk alt dizi için i, ikinci alt dizi için j)
        int i = 0, j = 0;

        // Birleştirme işlemi için ana dizinin indeksi
        int k = left;
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
    
    void sort(int []array,int left,int right) {
    	if(left < right) {
    		int midd = (left + right)/2;
    		sort(array, left, midd );
    		sort(array, midd + 1, right);
    		merge(array, left, midd,right);
    	}
    }
    static void print(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; ++i)
            System.out.print(array[i] + " ");
        	System.out.println();
    }
    public static void main(String[] args) {
    	int []array = {2,62,45,85,25,3,22};
    	NurettinİlkanEvran_MergeSort sorting = new NurettinİlkanEvran_MergeSort();
    	sorting.sort(array, 0, array.length - 1);
    	print(array);
    	
    }	
    	
}

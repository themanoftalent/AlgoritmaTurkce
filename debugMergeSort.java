public class MergeSort {

//    dizi siralama
    public static void mergeSort(int[] arr,int left,int right){
        //orta bul
        int middle = left+right/2;

// tamamlayiniz
//        code buaraya


    }
}
public static void merge(int[] arr,int left,int right, int middle) {

    int soltaraf = right-middle;
    int sagtaraf = middle-left+1;

    // gecisi swap dizi
    int[] tempR= new int[soltaraf];
    int[] tempL= new int[sagtaraf];

}
// tamamlayiniz
//        code buaraya

// Dizi birlesit
//code buraya

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4,5,6,8,7,8,5,55,6,5,6,5,2,3,1,2,4,5};
        System.out.println("unOrdered dizi"+ Arrays.toString(arr));

        mergeSort(arr,????);
        System.out.println("Ordered dizi"+ Arrays.toString(arr));
    }
}

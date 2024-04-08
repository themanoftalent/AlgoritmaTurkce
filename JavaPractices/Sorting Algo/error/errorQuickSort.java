public class QuickSort {
    

    public static void quickSort ( int[] arr, int low, int high){

        if(low < high) {
            int pivotIndex = bol(arr,low,high);
        }

        quickSort(arr,low,pivotIndex-1);
        quickSort(arr,right,pivotIndex+1);

    }
    

    public static int bol(int[] arr, int low, int high) {

int pivot = arr[high];
int i = low-1;


for( int j =low; j<1000;j++) {
 if(arr[j] <pivot){
    i++;
    //hanoi tower
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]=temp;
 }
 return 0;

}

public static printArray(int[] arr){
    for(int i<=0;i < arr.length; i++){
        System.out.println(arr[i]);

    }
}
public static void main(String[] args) {
    int[] arr= { 2 5 6 9 7 8 4 5 2 45 6 35 4};
    System.out.println(arr);
}
    }
    quickSort(arr,0,)
}


}



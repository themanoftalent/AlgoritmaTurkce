package Main;
import mergeSort.MergeSort;
import java.util.Arrays;
//Çağrı Demirkıran 2211502023
public class Main {
    public static void main(String[]args){
        int []array = {5,9,11,58,6,3};
        MergeSort ob = new MergeSort();
        ob.mergeSort(array,0, array.length-1);
        System.out.print(Arrays.toString(array));
    }
}

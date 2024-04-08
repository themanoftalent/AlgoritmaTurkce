import java.util.Arrays;
public class MergeSort {
     static void merge(int arr[],int left,int right,int middle){
         int n1=middle-left+1;
         int n2=right-middle;

         int L[]=new int[n1];
         int R[]=new int [n2];

         for(int i=0;i<n1;i++){
             L[i]=arr[left+i];

         }
         for(int j=0;j<n2;j++){
             R[j]=arr[middle+1+j];

         }
         int i=0,j=0;
         int temp = left;
         while(i<n1 && j<n2){
             if(L[i]<= R[j]){
                 arr[temp]=L[i];
                 i++;
             }
             else{
                 arr[temp]=R[j];
                 j++;
             }
             temp++;
         }
         while (i <n1){
             arr[temp]=L[i];
             i++;
             temp++;

         }
         while ( j<n2){
             arr[temp]=R[j];
             j++;
             temp++;

         }

    }
    static void mergeSort(int arr[],int l,int r){
         if (l<r){
             int m=(l+r)/2;
             mergeSort(arr,l,m);
             mergeSort(arr,m+1,arr.length-1);
             merge(arr,l, arr.length-1, m);
         }
    }

    static void printArray(int array[]){
         for(int i=0;i<array.length;i++){
             System.out.println(array[i]);
             System.out.println();
         }
    }
    public static void main(String args[]){
         MergeSort obje= new MergeSort();
         int array[]={89,56,4,2,8,4};
         obje.mergeSort(array,0, array.length-1);
         System.out.println(Arrays.toString(array));
    }
}

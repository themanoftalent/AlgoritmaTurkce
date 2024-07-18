package Week11;

public class YağızZorluBogoSort {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void shuffle(int[] a) {
        for(int i = 1; i < a.length; i++) {
            swap(a,i,(int)(Math.random() * i));
        }
    }

    public static boolean isSorted (int[] a) {
        for(int i = 1; i< a.length; i++) {
            if(a[i]<a[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void bogoSort(int[] a) {
        while(isSorted(a) == false) {
            shuffle(a);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,4,5,6,2,8};
        YağızZorluBogoSort bSort = new YağızZorluBogoSort();
        bSort.bogoSort(a);
        System.out.println("Sıralanmış Dizi:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}

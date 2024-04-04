public class BruteForce {
    public static int FindMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Liste boş olmaz");
        }

        int maxNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];   // [1 5 7 2 3 4 6 8 9 10]
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2, 3, 4, 6, 8, 9, 10};
        System.out.println(FindMax(arr));
    }
}

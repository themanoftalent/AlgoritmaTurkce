//2211502039 AYŞEGÜL UÇAR
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}

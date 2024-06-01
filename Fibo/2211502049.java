public class FiboCode{
    public static void main(String[] args) {
        int n = 10; 
        long baslama_saniyesi =System.nanoTime();
        System.out.println("Fibonacci dizisi:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        long bitis_saniyesi = System.nanoTime();
        long calisma = (bitis_saniyesi-baslama_saniyesi)/10000;
        System.out.println("\ncalisma zamani" + calisma);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

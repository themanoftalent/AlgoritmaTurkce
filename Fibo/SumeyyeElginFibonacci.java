package hafta9;

import java.util.Scanner;

public class SumeyyeElginFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void fibonacci2(int n) {
        int oncekiSayi1 = 0;
        int oncekiSayi2 = 1;
        int i = 3;
        System.out.print(oncekiSayi1 + " ");
        System.out.print(oncekiSayi2 + " ");
        while (i <= n) {
            int simdikiSayi = oncekiSayi1 + oncekiSayi2;
            System.out.print(simdikiSayi + " ");
            oncekiSayi1 = oncekiSayi2;
            oncekiSayi2 = simdikiSayi;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("fibonacci serinizin adım sayısını giriniz: ");
        int n = sc.nextInt();

        long startTime = 0, endTime = 0;

        startTime = System.nanoTime();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        endTime = System.nanoTime();

        double duration = (double)(endTime - startTime);

        System.out.println();
        System.out.print("algo süresi: " + duration + " nonosaniye");

        System.out.println("\n*****************");

        long start = 0, end = 0;

        start = System.nanoTime();

        fibonacci2(n);

        end = System.nanoTime();
        
        double time = (double)(endTime - startTime);

        System.out.println();
        System.out.println("ikinci algo süresi: " + time + " nonosaniye");

    }
}

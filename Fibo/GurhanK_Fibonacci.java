import java.util.Scanner;

public class GurhanK_Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Yazdırmak istediğiniz Fibonacci sayisi adedini giriniz: ");
        int sayac = scan.nextInt();  //Kullanıcıdan sayi alir Kaçıncı sayıya kadar yazdırılacağı girilir

        long startingdata = System.nanoTime();
        System.out.println("Fibonacci Serisi:");
        for (int i = 0; i < sayac; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        long endingData = System.nanoTime();

        long duration = (endingData-startingdata)/1000000;

        System.out.println("\n" + "Süre: " + duration);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0; // Önceki birinci Fibonacci sayısı
        int b = 1; // Önceki ikinci Fibonacci sayısı
        int current = 0; // Şu anki Fibonacci sayısı

        for (int i = 2; i <= n; i++) {
            current = a + b; // Şu anki Fibonacci sayısını hesaplar
            a = b;           // Önceki birinci Fibonacci sayısını günceller
            b = current;     // Önceki ikinci Fibonacci sayısını günceller
        }

        return current;
    }
}




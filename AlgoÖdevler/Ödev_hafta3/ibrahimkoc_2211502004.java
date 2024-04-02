public class ibrahimkoc_2211502004 {
        public static void main(String[] args) {
            int i = 5;

            System.out.println("i'nin değeri: " + i);

            int num1 = i++;
            System.out.println("i++ sonucu: " + num1);
            
            // i'yi kullan, sonra artır.

            System.out.println("i'nin yeni değeri: " + i);

            i = 5; // i'yi tekrar 5'e ayarlayalım

            int num2 = ++i;
            System.out.println("++i sonucu: " + num2);

            // i'yi artır, sonra kullan.

            System.out.println("i'nin yeni değeri: " + i);
        }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int num;

        do {
            System.out.print("Bir sayı gir (çıkmak için 0 girin): ");
            num = scanner.nextInt();

            toplam = toplam + num;
        } while (num != 0);

        System.out.println("sayıların toplamı: " + toplam);
    }
}


import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int faktoriyel = 1;

        do {
            System.out.print("Faktöriyel için bir sayı gir: (negatif bir sayı girerek çıkabilirsiniz): ");
            num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Negatif bir sayı girdiniz. Programdan çıkılıyor...");
                break;
            }

            for (int i = 1; i <= num; i++) {
                faktoriyel *= i;
            }

            System.out.println(num + "! = " + faktoriyel);
            faktoriyel = 1;
        } while (true);


    }
}


import java.util.Scanner;

public class yazdir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Bir sayı gir: ");
        num = scanner.nextInt();

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= num);
    }
}



import java.util.Scanner;

public class PozitifSayiKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Bir pozitif sayı gir: ");
            num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Hatalı, pozitif bir sayı girilmelisin");
            }
        } while (num <= 0);

        System.out.println("sayı pozitif: " + num);
    }
}



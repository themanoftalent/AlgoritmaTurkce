import java.util.Scanner;

public class ToplamaProgramı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        int sayac = 0;

        do {
            System.out.print("Bir sayı girin (Çıkmak için 0'a basın): ");
            sayi = scanner.nextInt();
            toplam += sayi;
            sayac++;
        } while (sayi != 0);

        System.out.println("Girdiğiniz sayıların toplamı: " + toplam);
    }
}


public class SayiSayacı {
    public static void main(String[] args) {
        int sayi = 1;
        int sayac = 0;

        do {
            if (sayi % 2 == 0) {
                sayac++;
            }
            sayi++;
        } while (sayi <= 100);

        System.out.println("1'den 100'e kadar olan çift sayıların sayısı: " + sayac);
    }
}


public class DogalSayiToplami {
    public static void main(String[] args) {
        int sayi = 1;
        int toplam = 0;
        int sinir = 10;

        do {
            toplam += sayi;
            sayi++;
        } while (sayi <= sinir);

        System.out.println("1'den " + sinir + "'e kadar olan sayıların toplamı: " + toplam);
    }
}
public class DiziToplami {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 30, 40, 50};
        int toplam = 0;
        int index = 0;

        do {
            toplam += dizi[index];
            index++;
        } while (index < dizi.length);

        System.out.println("Dizi elemanlarının toplamı: " + toplam);
    }
}
public class BoslukSayacı {
    public static void main(String[] args) {
        String metin = "Java programlama dili";
        int boslukSayisi = 0;
        int index = 0;

        do {
            if (metin.charAt(index) == ' ') {
                boslukSayisi++;
            }
            index++;
        } while (index < metin.length());

        System.out.println("Metindeki boşluk sayısı: " + boslukSayisi);
    }
}

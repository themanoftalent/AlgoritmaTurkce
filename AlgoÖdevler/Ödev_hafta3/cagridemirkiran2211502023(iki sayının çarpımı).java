import java.util.Scanner;
public class carpim {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz:");
        int number1 = sc.nextInt();
        System.out.print("2.sayiyi giriniz:");
        int number2 = sc.nextInt();

        int toplam = number1 * number2;
        System.out.print("iki sayinin carpimi = " + toplam);


    }
}
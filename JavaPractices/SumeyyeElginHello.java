import java.util.Scanner;
public class SumeyyeElginHello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;

        System.out.print("isminizi giriniz: ");
        name = input.nextLine();

        System.out.println("merhaba, " + name + "!");
    }
}

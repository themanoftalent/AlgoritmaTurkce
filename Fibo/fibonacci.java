import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayıyı görmek istersiniz? ");

        int n = scanner.nextInt();

        System.out.println("Fibonacci Dizisi:");
        for (int i = 0; i < n; i++) {

            System.out.print(fibonacci(i) + " ");
        }
    }


    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else

            return fibonacci(n - 1) + fibonacci(n-2);
}
}

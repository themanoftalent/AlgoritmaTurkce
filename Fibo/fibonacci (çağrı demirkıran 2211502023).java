import java.util.Scanner;
public class fibonacci {
    public static void main(String[]Args){
        long startData= System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç basamaklı sayı olacak:");
        int sayi = sc.nextInt();

        for (int i = 1;i<sayi+1; i++){
            System.out.print(fibonacci(i)+" "+"");
        }
        System.out.print("\n");
        long endData = System.nanoTime();

        long duration = (endData-startData/100);
        System.out.print(duration);
    }
    public static int fibonacci(int sayi){
        if (sayi <= 1){
            return 1;
        }
        else {
            int n1 = 0, n2 =1;
            for (int i=2; i<=sayi;i++){
                int temp = n1+n2;
                n1 = n2;
                n2= temp;
            }
            return n2;
        }
    }
}

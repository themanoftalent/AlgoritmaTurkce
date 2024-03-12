import java.util.Scanner;
public class ikisayinincarpimi {
    public static void main(String[]args){
        Scanner okuyucu = new Scanner(System.in);
        System.out.print("please enter the first number:");
        int number1 = okuyucu.nextInt();
        System.out.print("please enter the second number:");
        int number2 = okuyucu.nextInt();

        int carpim = number1 * number2;
        System.out.print("Multiplication result:"+carpim);




    }
}

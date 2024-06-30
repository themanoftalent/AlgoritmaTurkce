
//Fibonacci Dizisi

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {                                  //Osman Arı 2211502018
        Scanner sc=new Scanner(System.in);
        System.out.println("Sıralanacak Fibonacci dizisi için sınır sayısı girin:");
        int num=sc.nextInt();
        System.out.print("Fibonacci sequence up to "+num+": ");
        long startTime=System.currentTimeMillis();

        for(int i=0;i<num;i++){
            System.out.print(fibonacci(i)+" ");
            }
        long endTime=System.currentTimeMillis();
        long sonuc=endTime-startTime;
        System.out.println("\nİşlem süresi:"+sonuc+" milisaniye.");

    }

    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        else{
            int a=0,b=1;
            for(int i=0;i<num;i++){
               int temp=a+b;
               a=b;
               b=temp;

            }
            return b;
        }
    }
}

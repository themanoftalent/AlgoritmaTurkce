// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class hasan{
public static void main ( String [] args ) {
    int i = 5 ;
    System.out.println("i'nin degeri: " + i );
    int sayi1 = i ++;
   System.out.println("i++ sonuc: " + sayi1 );
   // i'yi kullan, sonra artir.
   System.out.println("i'nin yeni degeri: " + i );
   i = 5 ; // tekrar 5'e ayarlayalim
   int sayi2 = ++ i;
   System.out.println("++i sonuc: " + sayi2 ); // i'yi artir, sonra kullan. 
   System.out.println("i'nin yeni degeri: " + i );
   }
}

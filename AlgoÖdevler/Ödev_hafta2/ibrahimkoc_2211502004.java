public class ibrahim {
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


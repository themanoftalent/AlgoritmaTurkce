# Increment and Decrement Operators


++i ve i++ ifadeleri, bir değişkenin değerini artırmak için kullanılan iki farklı artırma operatörüdür. Her ikisinin de bir değişkenin değeri bir birim artar, ancak aralarında önemli bir fark vardır.

- `++i`: Önce değişkenin değerini arttırır, ardından bu arttırılmış değeri kullanır.
- `i++`: Önce değişkenin ilk değeri kullanılır, ardından değeri arttırılır.

Örneğin, `a=5` olsun:

- `B=a++` dediğimizde, a'nın değeri 6 olurken B=5 olur.
- `B=++a` dediğimizde ise, a'nın değeri 6 olur ve B de 6 olur.

------



    public class ArtirmaOperatorleri {
    public static void main(String[] args) {
        int a = 5;
        int b;

        // ++i operatörü kullanımı
        b = ++a; // a'yı önce 1 arttır, sonra b'ye ata
        System.out.println("a'nın değeri: " + a); // 6
        System.out.println("b'nin değeri: " + b); // 6

        // i++ operatörü kullanımı
        a = 5; // a'yı tekrar 5 yap
        b = a++; // a'yı b'ye ata, sonra a'yı 1 arttır
        System.out.println("a'nın değeri: " + a); // 6
        System.out.println("b'nin değeri: " + b); // 5
    } }



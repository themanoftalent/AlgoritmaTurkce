public class SumeyyeElgin {
    public static void main(String[] args) {
        /* ++i pre-increment operatör olarak bilinir, i değişkeninin değerini hemen arttırır ve işlem içerisinde arttırılmış değeri
        kullanır/döndürür. i++ ise post-increment operatör olarak bilinir, i değerini artırır ancak işlem içerisinde
        bir önceki değerini döndürür/kullanır. işlem içerisinde kullanıldıktan sonra değeri artmış olur. */

        // örneklerle test edelim:

        int i = 5;
        System.out.println(i++);

        int j = 5;
        System.out.println(++j);

        // görüldüğü gibi birinci işlemimiz 5 değerini döndürürken ikinci işlemimiz 6 değerini döndürmekte.

        System.out.println("#####");

        //şimdi de ikisinin de artmış olduğunu ispatlayalım:

        System.out.println(i+2);
        System.out.println(j+2);

        //görüldüğü gibi iki işlemde de arttırılmış değer kullanıldı.

    }
}

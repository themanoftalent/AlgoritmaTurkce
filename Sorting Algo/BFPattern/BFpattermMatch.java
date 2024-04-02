public class BetterBruteForcePatternMatching {
    public static void search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) { // Metin boyutu - Desen boyutu kadar döngüyü dolaş
            int j;
            for (j = m - 1; j >= 0; j--) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break; // Karakterler eşleşmezse döngüyü sonlandır
                }
            }
            if (j == -1) { // Desenin tüm karakterleri eşleşirse
                System.out.println("Desen " + pattern + " metin içinde konum: " + i);
            }
        }
    }

    public static void main(String[] args) {
        String text = "abacadabrabracabracadabrabrabracad";
        String pattern = "abracadabra";
        search(text, pattern);
    }
}

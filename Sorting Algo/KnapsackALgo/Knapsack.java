public class Knapsack {

    // Knapsack problemini çözmek için yardımcı metot
    public static int knapsack(int capacity, int[] weights, int[] values, int n) {
        // İlk önce tablo oluşturulur
        int[][] table = new int[n + 1][capacity + 1];

        // Tabloyu doldurma
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    table[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    table[i][w] = Math.max(values[i - 1] + table[i - 1][w - weights[i - 1]], table[i - 1][w]);
                } else {
                    table[i][w] = table[i - 1][w];
                }
            }
        }

        return table[n][capacity]; // En yüksek değeri döndür
    }

    public static void main(String[] args) {
        int capacity = 10; // Çantanın kapasitesi
        int[] values = {60, 100, 120}; // Eşyaların değerleri
        int[] weights = {10, 20, 30}; // Eşyaların ağırlıkları
        int n = values.length; // Eşya sayısı

        // Knapsack problemini çöz
        int maxValue = knapsack(capacity, weights, values, n);
        System.out.println("Çantanın en yüksek değeri: " + maxValue);
    }
}

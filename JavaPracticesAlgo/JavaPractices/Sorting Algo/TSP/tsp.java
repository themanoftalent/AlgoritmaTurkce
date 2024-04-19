import java.util.ArrayList;
import java.util.Arrays;

public class TSP {
    
    // Şehirler arası mesafeleri içeren matris
    private static int[][] distances = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    }; // Örnek şehirler arası mesafeler
    
    private static int minDistance = Integer.MAX_VALUE; // Minimum mesafe
    private static ArrayList<Integer> minPath; // Minimum yol
    
    public static void main(String[] args) {
        int n = distances.length;
        ArrayList<Integer> path = new ArrayList<>();
        
        // Başlangıçta tüm şehirlerin listesi
        for (int i = 0; i < n; i++) {
            path.add(i);
        }
        
        // Tüm permütasyonları oluştur ve en kısa yolu bul
        permute(path, 0);
        
        // Sonucu yazdır
        System.out.println("Minimum Mesafe: " + minDistance);
        System.out.println("Minimum Yol: " + minPath);
    }
    
    // Tüm permütasyonları oluşturmak için yardımcı metot
    private static void permute(ArrayList<Integer> path, int l) {
        // Bir permütasyon tamamlandığında, toplam mesafeyi hesapla ve minimuma karşılaştır
        if (l == path.size() - 1) {
            int distance = calculateDistance(path);
            if (distance < minDistance) {
                minDistance = distance;
                minPath = new ArrayList<>(path);
            }
        } else {
            // Diğer durumda, şehirleri yer değiştirerek permütasyonları oluştur
            for (int i = l; i < path.size(); i++) {
                swap(path, l, i);
                permute(path, l + 1);
                swap(path, l, i); // Geri al
            }
        }
    }
    
    // Bir yolun toplam mesafesini hesaplamak için yardımcı metot
    private static int calculateDistance(ArrayList<Integer> path) {
        int distance = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            distance += distances[path.get(i)][path.get(i + 1)];
        }
        distance += distances[path.get(path.size() - 1)][path.get(0)]; // Başlangıç şehrine geri dön
        return distance;
    }
    
    // İki şehri yer değiştirmek için yardımcı metot
    private static void swap(ArrayList<Integer> path, int i, int j) {
        int temp = path.get(i);
        path.set(i, path.get(j));
        path.set(j, temp);
    }
}

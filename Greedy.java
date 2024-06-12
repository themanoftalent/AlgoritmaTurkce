import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgo {
    int value, weight;
    
    GreedyAlgo(int value, int weight){
        this.value = value;
        this.weight = weight;
       
    }
}

class Parca{
    static double enBuyukDegerAl(GreedyAlgo[] greed, int listeBuyuklugu) {
        Arrays.sort(greed, new Comparator<GreedyAlgo>() {
            @Override
            public int compare(GreedyAlgo o1, GreedyAlgo o2) {
                return 0;
            }
        });
        
        
    }
    
    
        }

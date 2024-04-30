
/*  Bellman Ford Algoritması


                                Düğümler arası mesafe    Güncellenen değerler
                                        A-B=2               min(A,B)=2
     A---2---B-----4---C                A-D=1               min(A,D)=1
     |      / \        \                B-C=4               min(B,C)=6
     |     /   \        1               B-E=3               min(B,E)=5
     1    2     3        F              B-D=2               min(B,D)=4
     |   /       \      /               D-E=3               min(D,E)=4
     |  /         \    5                E-F=5               min(E,F)=9
     | /           \  /                 C-F=1               min(C,F)=7
     D-------3------E

   Başlangıç noktası:A
   Bitiş noktası:F
                                      */


// Algoritma,grafikteki en kısa yolları hesaplar ve sonuçları ekrana yazdırır.

import java.util.*;
class BellmanFord {
    static class Edge {
        int source, destination, weight;

        Edge() {
            source = destination = weight = 0;
        }
    }

Edge[] edge;
BellmanFord(int v,int e){
    edge=new Edge[e];
    for(int i=0;i<e;++i){
        edge[i]=new Edge();
    }
}
    void BellmanFordAlgo(Edge[] edges, int V, int E, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 1; i < V; i++) {
            for (int j = 0; j < E; ++j) {
                int u = edges[j].source;
                int v = edges[j].destination;
                int weight = edges[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        for (int j = 0; j < E; ++j) {
            int u = edge[j].source;
            int v = edge[j].destination;
            int weight =edge[j].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                return;
            }
        }

        printArr(dist, V);
    }

    void printArr(int dist[], int V) {
  System.out.println("Düğümlere olan en kısa mesafeler:");
  for(int i=0;i<V;++i){
      System.out.println(i+"\t\t"+dist[i]);
  }
    }

    public static void main(String[] args){
        int V=5;//Düğüm sayısı
        int E=8;//Kenar sayısı
        BellmanFord graph= new BellmanFord(V,E);
        //Kenarlar
        graph.edge[0].source=0;
        graph.edge[0].destination=1;
        graph.edge[0].weight=5;

        graph.edge[1].source = 0;
        graph.edge[1].destination = 2;
        graph.edge[1].weight = 4;

        graph.edge[2].source = 1;
        graph.edge[2].destination = 3;
        graph.edge[2].weight = 3;

        graph.edge[3].source = 2;
        graph.edge[3].destination = 1;
        graph.edge[3].weight = 6;

        graph.edge[4].source = 3;
        graph.edge[4].destination = 2;
        graph.edge[4].weight = 2;

        graph.edge[5].source = 4;
        graph.edge[5].destination = 3;
        graph.edge[5].weight = 6;

        graph.BellmanFordAlgo(graph.edge,V,E,0);

    }

}

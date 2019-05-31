package com.company;

public class DijkstraAlgorithm {
    public int minDistance(int dist[],Boolean b[]){
        int min = Integer.MAX_VALUE ,index = -1;
        for (int x = 0; x <5 ; x++) {
            if (!b[x]&&dist[x]<=min){
                min=dist[x];
                index = x;

            }

        }
        return index;

    }

    public void dijkstra(int graph[][],int src){
        int dist[] = new int[5];
        Boolean b[]  = new Boolean[5];
        for (int i = 0; i < 5; i++) {
            dist[i] = Integer.MAX_VALUE;
            b[i] = false;
            
        }
        dist[src] = 0;


        for (int count = 0; count <5 ; count++) {
            int u = minDistance(dist,b);
            b[u] = true;
            for (int x = 0; x <5     ; x++) {
                if(!b[x]&&graph[u][x]!=0&&dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][x]<dist[x]){
                    dist[x]=dist[u]+graph[u][x];


                }
                printGraph(dist,x);
            }

        }


    }
    public  void printGraph(int dist[],int src){
        System.out.println("Distance from source to Destination is:");
        for (int i = 0; i <5; i++) {

            System.out.println(i+ "---------------"+dist[i]);
        }
    }
    public static void main(String[] args) {
        int graph[][] = new int[][]{{0, 4, 0, 0, 7},//0
                {4, 0, 1, 2, 0},//1
                {0, 1, 0, 6, 0},//2
                {0, 2, 6, 0, 0},//3
                {7, 0, 0, 0, 0} //4
        };


        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        dijkstraAlgorithm.dijkstra(graph, 0);
    }
}

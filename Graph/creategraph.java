import java.util.ArrayList;
import java.util.*;

public class creategraph{


    static class Edge{
        int src ;
        int dest;
    
        public Edge(int s , int d){
            this.src= s;
            this.dest=d;
        }
    }
    public static void graph(ArrayList<Edge> Graph[]){
        for(int i =0 ; i<Graph.length;i++){
            Graph[i]= new ArrayList<Edge>();
        }

        Graph[0].add(new Edge(0,1));

        Graph[1].add(new Edge(1,0));
        Graph[1].add(new Edge(1,2));



    }

    public static void main(String[] args) {
        int v = 2;
        ArrayList<Edge> Graph[] = new ArrayList[v];
        graph(Graph);
        for(int i=0; i<Graph[1].size();i++){
            Edge e = Graph[1].get(i);
            System.out.println(e.dest);
        }
    }

}
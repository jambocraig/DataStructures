package graphs;

import java.util.LinkedList;

class GraphAL {
    // attributes
    LinkedList<Integer> []graph;
    int size;

    // constructor
    public GraphAL(int size) {
        this.size = size;
        graph = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            graph[i] = new LinkedList<>();
        }
    }


    public static void printGraph(GraphAL g) {
        for (int i = 0; i < g.size; i++) {
            System.out.print(i);
            for (Integer j : g.graph[i]) {
                System.out.print(" -> " + j);
            }
            System.out.println();
        }
    }

    public static void add(GraphAL g, int src, int dest) {    //Link the vertices of the graph
        g.graph[src].add(dest);
        g.graph[dest].add(src);
    }
}



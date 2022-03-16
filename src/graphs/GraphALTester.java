package graphs;

import java.util.Scanner;

// this needs improvement - very poor
public class GraphALTester {
    public static void main(String[] agrs) {
        Scanner e = new Scanner(System.in);
        System.out.println(" Enter the Size of the graph ");

        int size = e.nextInt();
        GraphAL g = new GraphAL(size);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the first link and the second link ");
            int src = e.nextInt();
            int dest = e.nextInt();
            g.add(g, src, dest);                                    //Initialise the link
        }
        System.out.println("The undirected graph is \n ");
        g.printGraph(g);
    }
}

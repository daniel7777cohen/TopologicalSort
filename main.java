
public class main {

    // Driver method
    public static void main(String args[])
    {
        // Create a graph given in the above diagram
        Graph g = new Graph(8);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.addEdge(4, 6);
        g.addEdge(0, 7);

 
        System.out.println("Following is a Topological " +
                           "sort of the given graph");
        
       int [] topological =  g.topologicalSort();
        for(int i = 0;i<topological.length;i++)
        	System.out.print(topological[i]+" ");
        
        System.out.println();
        g.DFS();
    }
}

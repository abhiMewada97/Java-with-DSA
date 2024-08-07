import java.util.*;


public class BFS {
    
    static class Edge {

        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
            
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 2));

        
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        
        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 2));

        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5, 4, 2));
        graph[5].add(new Edge(5, 6, 2));

        graph[6].add(new Edge(6, 5, 2));
    }

    public static void bfs_traversal(ArrayList<Edge>[] graph){  // O(V+E)   \\  O(V^2)      in case of matrix

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        Edge ee = graph[0].get(0);
        q.add(ee.src);

        while (!q.isEmpty()) {
            
            int curr = q.remove();

            if(!vis[curr]) { // visit curr

                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String []args) {
         /*
                    0 ------- 1
                     \         \
                      \         \
                       \         \ 
                         2        3
                          \      / \
                           \    /   \
                              4  --- 5 --- 6
        */

        int V = 7;
        ArrayList<Edge> [] graph = new ArrayList[V];  // null --> empyt arraylist

        createGraph(graph);
        bfs_traversal(graph);
    }
}

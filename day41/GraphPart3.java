import java.util.*;;

class Pair {
    int weight;
    int dest;

    Pair(int w, int dest) {
        this.weight = w;
        this.dest = dest;
    }
}

public class GraphPart3 {
    public int vertices;
    ArrayList<ArrayList<Pair>> wg;

    GraphPart3(int v) {
        this.vertices = v;
        wg = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            wg.add(new ArrayList<Pair>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        wg.get(src).add(new Pair(weight, dest));
        wg.get(dest).add(new Pair(weight, src)); // undirected
    }

    public void display() {
        for (int i = 0; i <= vertices; i++) {
            System.out.print("Source : " + i + "-> ");
            for (Pair obj : wg.get(i)) {
                System.out.print("{" + "Dest: " + obj.dest + " Weight: " + obj.weight + "} ");
            }
            System.out.println();
        }

    }

    public void dijkstraAlgo(int src, int dest) {
        boolean visited[] = new boolean[vertices + 1];
        int distance[] = new int[vertices + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        distance[src] = 0;
        pq.offer(new Pair(0,src));
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.dest;
            for (Pair obj : wg.get(node)) {
                int newNode = obj.dest;
                int w = obj.weight;
                if (!visited[newNode] && distance[node] + w < distance[newNode]) {
                    distance[newNode] = distance[node] + w;
                    visited[newNode] = true;
                    pq.offer(obj);
                }
            }
            System.out.println("From source :" + src + " to dest the distance is : " + distance[dest]);
        }
    }

    public static void main(String[] args) {
        GraphPart3 graph = new GraphPart3(5);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 4, 1);
        graph.addEdge(1, 5, 3);
        graph.addEdge(2, 5, 2);
        graph.addEdge(3, 4, 2);
        graph.addEdge(3, 5, 2);
        // graph.display();
        graph.dijkstraAlgo(1, 5);
    }
}

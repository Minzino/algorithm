package bj1967;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static boolean[] visited;
    private static List<List<Node>> tree;
    private static int farthestNode;
    private static int longestDistance = Integer.MIN_VALUE;

    private static void dfs(int currentNode, int currentDistance) {
        if (currentDistance > longestDistance) {
            longestDistance = currentDistance;
            farthestNode = currentNode;
        }

        visited[currentNode] = true;
        for (Node neighbor : tree.get(currentNode)) {
            if (!visited[neighbor.node]) {
                visited[neighbor.node] = true;
                dfs(neighbor.node, currentDistance + neighbor.distance);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());

            tree.get(parent).add(new Node(child, distance));
            tree.get(child).add(new Node(parent, distance));
        }

        visited = new boolean[n + 1];
        dfs(1, 0);
        visited = new boolean[n + 1];
        dfs(farthestNode, 0);
        System.out.println(longestDistance);
    }
}

class Node {

    int node;
    int distance;

    public Node(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}

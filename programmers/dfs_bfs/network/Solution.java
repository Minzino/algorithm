package dfs_bfs.network;

class Solution {
    public void dfs(int[][] computers, int[] visited, int current) {
        visited[current] = 1;

        for (int i = 0; i < computers.length; i++) {
            if (computers[current][i] == 1 && visited[i] == 0) {
                dfs(computers, visited, i);
            }
        }
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(computers, visited, i);
                answer++;
            }
        }

        return answer;
    }
}

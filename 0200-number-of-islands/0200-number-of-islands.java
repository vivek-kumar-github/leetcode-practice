class Solution {
    void dfs(int rw, int cl, int[][] vis, char[][] grid) {
        int n = grid.length, m = grid[0].length;
        vis[rw][cl] = 1;
        if ((rw + 1) < n && grid[rw + 1][cl] == '1' && vis[rw + 1][cl] == 0) dfs(rw + 1, cl, vis, grid);
        if ((rw - 1) >= 0 && grid[rw - 1][cl] == '1' && vis[rw - 1][cl] == 0) dfs(rw - 1, cl, vis, grid);
        if ((cl + 1) < m && grid[rw][cl + 1] == '1' && vis[rw][cl + 1] == 0) dfs(rw, cl + 1, vis, grid);
        if ((cl - 1) >= 0 && grid[rw][cl - 1] == '1' && vis[rw][cl - 1] == 0) dfs(rw, cl - 1, vis, grid);
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && vis[i][j] == 0) {
                    dfs(i, j, vis, grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
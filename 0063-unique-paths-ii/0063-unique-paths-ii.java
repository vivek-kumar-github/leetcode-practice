class Solution {
    public int rec(int i, int j, int[][] dp, int n, int m, int[][] grid) {
        if (i == n - 1 && j == m - 1) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        int ways = 0;
        if (j + 1 < m && grid[i][j + 1] != 1) ways += rec(i, j + 1, dp, n, m, grid);
        if (i + 1 < n && grid[i + 1][j] != 1) ways += rec(i + 1, j, dp, n, m, grid);
        return dp[i][j] = ways;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        if(grid[0][0]==1) return 0;
        int[][] dp = new int[n][m];
        for (int i =0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return rec(0, 0, dp, n, m, grid);
    }
}
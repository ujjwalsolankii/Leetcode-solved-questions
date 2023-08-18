class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
         int[] totaldegree = new int[n];

        boolean[][] isconnected = new boolean[n][n];

        for(int i = 0;i < roads.length;i++){
            isconnected[roads[i][0]][roads[i][1]] = true;
            isconnected[roads[i][1]][roads[i][0]] = true;
            totaldegree[roads[i][0]]++;
            totaldegree[roads[i][1]]++;
        }

        int ans = 0;

        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                ans = Math.max(ans, helper(i, j, totaldegree, isconnected));
            }
        }

        return ans;

    }

    private int helper(int i, int j, int[] res, boolean[][] isconnected){
        int ans = res[i]+res[j];

        if(isconnected[i][j]){
            ans --;
        }

        return ans;
    }
}
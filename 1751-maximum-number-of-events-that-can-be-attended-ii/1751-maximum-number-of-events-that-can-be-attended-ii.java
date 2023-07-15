class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int n = events.length;
        int [][] dp = new int [n][k + 1];
        int max = 0;
        for (int i=0; i<n; i++) {
            max = Math.max(max, events[i][2]);
            dp[i][1] = events[i][2];
        }
        if (k == 1)
            return max;
        for (int i=1; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (events[j][1] < events[i][0]) {
                    for (int x=2; x<=k; x++) {
                        dp[i][x] = Math.max(dp[i][x], dp[j][x-1] + events[i][2]);
                    }
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<=k; j++) {
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }
}
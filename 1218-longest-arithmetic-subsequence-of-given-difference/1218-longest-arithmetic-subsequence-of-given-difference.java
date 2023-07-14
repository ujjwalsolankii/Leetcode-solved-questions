class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int res = 1;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++){
            int cnt = map.getOrDefault(arr[i]-difference , 0)+1;
            res = Math.max(res,cnt);
            map.put(arr[i] , cnt);
        }
        return res;
    }
}
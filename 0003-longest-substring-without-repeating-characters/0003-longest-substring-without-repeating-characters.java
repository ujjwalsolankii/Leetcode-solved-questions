class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> hm = new HashMap<>();
        int l = 0, r = 0;
        int n = s.length();
        int len= 0;
        while(r < n) {
            if(hm.containsKey(s.charAt(r))){
                l = Math.max(hm.get(s.charAt(r)) + 1 , l);
            }
            hm.put(s.charAt(r) , r);
            len = Math.max(len , r-l+1);
            r++;
        }
        return len;
    }
}
               
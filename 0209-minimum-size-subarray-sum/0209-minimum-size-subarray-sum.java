class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0 , r=0 ,sum=0 , length=Integer.MAX_VALUE , n=nums.length;
        
        while(r<n){
            sum = sum + nums[r];
            if(sum>=target){
                while(sum>=target){
                    sum = sum-nums[l];
                    l++;
                }
                length = Math.min(length,(r-l)+2);
            }
            r++;
        }
        return length==Integer.MAX_VALUE?0:length;
    }
}
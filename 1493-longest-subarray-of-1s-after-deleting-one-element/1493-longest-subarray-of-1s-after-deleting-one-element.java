class Solution {
    public int longestSubarray(int[] nums) {
        int head = 0 , tail = 0 , count = 0 , ans = 0;
        
        for(head = 0; head<nums.length; head++){
            if(nums[head] == 0) count++;
            
            while(count>1){
                if(nums[tail]==0) count--;
                tail++;
            }
            ans = Math.max(ans,head-tail);
        }
        return ans;
    }
}
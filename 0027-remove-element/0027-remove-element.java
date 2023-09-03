class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        while(i<n){
            if(nums[i]==val){
                i++;
            }
            else{
                nums[j] = nums[i];
                j++; i++;
            }
        }
        return j;
    }
}
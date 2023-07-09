class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n<3){
            return nums[0];
        }
        Arrays.sort(nums);
        if(nums[0] != nums[1]) return nums[0];
        int i=1;
        while(i<n){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
            i+=3;
        }
        return nums[n-1];
    }
}
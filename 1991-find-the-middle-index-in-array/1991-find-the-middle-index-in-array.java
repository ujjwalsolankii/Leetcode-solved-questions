class Solution {
    public int findMiddleIndex(int[] nums) {
        int arraySum = 0;
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            arraySum += nums[i];
        }
        for(int j=0;j<nums.length;j++){
            arraySum -= nums[j];
        if(arraySum == temp) return j;
        temp += nums[j];
        }
        return -1;
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int l=0,i=0, r=nums.length-1;
        while(i<=r){
            if(nums[i] == 0){
                // swap i l , i++ l++
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                i++; l++;
            }
            else if(nums[i] == 2){
                //swap i r ,r--
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
            }
            else{
                i++;
            }
        }
    }
}
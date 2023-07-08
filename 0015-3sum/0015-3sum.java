class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a1 = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate values of the first element
            }
            int j=i+1; int k=nums.length-1;
            while(j<k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    a1.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
                else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return a1;
    }
}
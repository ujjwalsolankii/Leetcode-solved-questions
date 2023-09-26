class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=Arrays.stream(arr).sum();
        if(sum%3!=0)
            return false;
        int tempSum=0,partitionCount=0;
        for(int i=0;i<arr.length;i++){
            tempSum+=arr[i];
            if(partitionCount==2)
                return true;
            if(tempSum==sum/3){
                partitionCount++;
                tempSum=0;
            }
        }
        return false;
    }
}
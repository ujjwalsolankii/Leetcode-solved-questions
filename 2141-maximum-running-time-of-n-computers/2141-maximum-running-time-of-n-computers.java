class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long startTime=0;
        long endTime=0;
        for(int i=0;i<batteries.length;i++){
            endTime+=batteries[i];
        }
        long ans=0;
        while(startTime<=endTime){
            long mid=startTime + (endTime-startTime)/2;
            if(isPossible(n,batteries,mid)){
                ans=mid;
                startTime=mid+1;
            } else {
                endTime=mid-1;
            }
        }
        return ans;
    }
    public boolean isPossible(int n,int batteries[],long mid){
        long time=0;
        for(int i=0;i<batteries.length;i++){
            if(batteries[i]<=mid){
                time+=batteries[i];
            } else {
                time+=mid;
            }
        }
        return time>= mid*n;
    }
}
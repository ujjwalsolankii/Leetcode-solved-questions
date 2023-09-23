class Solution {
    public int specialArray(int[] a) {
        int l=1,h=a.length;
        while(l<=h){
            int m=l+(h-l)/2;
            int c=0;
            for(int j: a){
                if(j>=m)
                c++;
            }
            if(c==m)
            return c;
            else if(c>m)
            l=m+1;
            else h=m-1;
        }
        return -1;
    }
}
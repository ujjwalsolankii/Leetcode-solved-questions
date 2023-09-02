class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n = x;
        int temp = 0;
        while(n>=1){
            int a = n%10;
            temp = temp*10 + a;
            n = n/10;
        }
        if(temp==x) return true;
        else return false;
        
    }
}
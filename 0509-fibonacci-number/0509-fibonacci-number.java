class Solution {
    public int fib(int n) {
            //recursion
        // if(n==0 || n==1){
        //     return n;
        // }
        // return fib(n-1)+fib(n-2);
        
            // basic forloop
        long prev1 = 1;
        long prev2 = 1;
        if(n==1 || n==2){
            return 1;
        }
        if(n==0) return 0;
        for(int i = 3; i<n+1; i++){
            long temp = prev2;
            prev2 = prev2 + prev1;
            prev1 = temp;
        }
        return (int)prev2;
    }
}
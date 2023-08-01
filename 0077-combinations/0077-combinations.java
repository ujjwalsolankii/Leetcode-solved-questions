class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        solve(1,k,n,res,arr);
        return res;
    }
    void solve(int curr, int k,int n ,List<List<Integer>> res , List<Integer> arr){
        if(k==0){
            res.add(new ArrayList<>(arr));
            return;
        }
        if(curr>n) return;
        
        //taking it
        arr.add(curr);
        solve(curr+1 , k-1 , n , res , arr);
        arr.remove(arr.size()-1);
        solve(curr+1, k , n , res , arr);
        
    }
}
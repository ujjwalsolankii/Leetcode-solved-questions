class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(helper(answerKey,k,'T'),helper(answerKey,k,'F'));
    }
    public int helper(String st,int k,char ch){
        int s=0 , e=0 , ans=0;
        while(e<st.length()){
            char curr = st.charAt(e);
            if(curr!=ch){
                k--;
            }
            while(k<0){
                if(st.charAt(s)==ch){
                    s++;   
                }
                else{
                    k++;
                    s++;
                }
            }
            ans=Math.max(ans,e-s+1);
            e++;
        }
        return ans;
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                if(i+1 < s.length() && s.charAt(i+1) != ' '){
                    len = 0;
                }
            }else{
                len++;
            }
        }
        return len;
    }
}
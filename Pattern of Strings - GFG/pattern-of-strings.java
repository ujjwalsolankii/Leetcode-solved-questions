//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            ArrayList<String> result = ob.pattern(S);
            for(String value : result){
                System.out.println(value);
            }
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String> al = new ArrayList<>();
        int n = S.length()-1;
        int j=0;
        while(j<=n){
            StringBuilder sb = new StringBuilder();
            for(int i=j; i<=n; i++){
                sb.append(S.charAt(i));
            }
            al.add(sb.toString());
            n--;
        }
        return al;
    }
};
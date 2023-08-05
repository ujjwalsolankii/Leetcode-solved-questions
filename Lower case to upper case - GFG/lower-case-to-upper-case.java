//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.to_upper(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String to_upper(String str) 
    { 
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char a = str.charAt(i);
            int ascii = (int) a;
            int newascii = ascii-32;
            sb.append((char)newascii);
        }
        return sb.toString();
    }
} 
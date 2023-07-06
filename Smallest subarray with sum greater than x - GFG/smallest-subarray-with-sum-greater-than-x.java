//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.smallestSubWithSum(a, n, m));
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int arr[], int n, int x) {
        // Your code goes here 
        // int minLen = Integer.MAX_VALUE;
        // int sum = 0;
        // int j = 0;
        // for(int i = 0;i<n;i++){
        //     sum += arr[i];
        //     while(sum > x){
        //         minLen = Math.min(minLen, i-j+1);
        //         sum -= arr[j];
        //         j++;
        //         if(sum<=x)break;
        //     }
        // }
        // return minLen;
        
        int l=0 , r=0 ,sum=0 , length=Integer.MAX_VALUE;
        
        while(r<n){
            sum += arr[r];
                while(sum>x){
                    length = Math.min(length,(r-l)+1);
                    sum-=arr[l];
                    l++;
                }
            r++;
        }
        return length;
    }
}


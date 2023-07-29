//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;

  public class longestString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n = sc.nextInt();
            String[] names = new String[n];

            for (int j = 0; j < n; j++) names[j] = sc.next();

            GFG obj = new GFG();
            System.out.println(obj.longest(names, n));
        }
    }

}

// } Driver Code Ends


class GFG {
    String longest(String names[], int n) {
        StringBuilder ans = new StringBuilder();
        int len = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            String var = names[i];
            StringBuilder sb = new StringBuilder();
            sb.append(var);
            if(sb.length()>len){
                index = i;
                len = sb.length();
            }
        }
        String var = names[index];
        ans.append(var);
        
        return ans.toString();
    }
}
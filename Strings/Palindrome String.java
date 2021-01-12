
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
            System.out.println(ob.isPlaindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPlaindrome(String S) {
       
       int i,j;
       i=0;
       j=S.length()-1;
       while(i<j)
       {
           if(S.charAt(i)!=S.charAt(j))
            return 0;
            
            i++;
            j--;
       }
       return 1;
    }
}

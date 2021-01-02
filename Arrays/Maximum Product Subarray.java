
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] a, int n) {
    if(n==0)
      return -1;
    if(n==1)
       return a[0];
    long choice2,choice3;
    long minpro=a[0];
    long maxpro=a[0];
    long prod=a[0];
    for(int i=1;i<n;i++)
    {
        choice2=minpro*a[i];
        choice3=maxpro*a[i];
        minpro=Math.min(a[i],Math.min(choice2,choice3));
        maxpro=Math.max(a[i],Math.max(choice2,choice3));
        prod=Math.max(prod,maxpro);
    }
    
    return prod;
    }
}
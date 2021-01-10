// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int bin(int []a,int l,int r)
    {
        while(l<=r)
        {
          int mid=l+(r-l)/2;
          if((mid==0 || (a[mid-1]==0))&&a[mid]==1) 
            return mid;
          else if(a[mid]==0)
           return bin(a,mid+1,r);
          else
           return bin(a,l,mid-1);
        }
        return -1;
    }
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int index=0,i;
        int max=-1;
        int maxindex=0;
        int flag=1;
        HashSet<Integer> hs=new HashSet<Integer>();
        for(i=0;i<n;i++)
        {
            index=bin(arr[i],0,m-1);
            if(index==-1)
            hs.add(0);
            else
            hs.add(1);
            if(index!=-1&&m-index>max)
            {
                max=m-index;
                maxindex=i;
            }
            
        }
        if(!hs.contains(1))
        return -1;
        else
        return maxindex;
        
      
        
    }
}
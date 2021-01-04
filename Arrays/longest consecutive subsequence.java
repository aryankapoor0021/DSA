
import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class Driverclass
{
    // Driver Code
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    
		    // Making object of GfG	
			Subseq g = new Subseq();
			
			System.out.println(g.findLongestConseqSubseq(a, n));
		
		t--;
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Subseq
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    // return the length of the longest subsequene of consecutive integers
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	   HashSet<Integer> hs=new HashSet<Integer>();
	   for(int i=0;i<n;i++)
	     hs.add(arr[i]);
	    
	   int ans=0;
	   for(int i=0;i<n;i++)
	   {
	       if(!hs.contains(arr[i]-1))
	       {
	           
	         int x=arr[i];
	         while(hs.contains(x))
	          x++;
	          
	         ans=Math.max(ans,x-arr[i]);
	       }
	   }
	   return ans;
	   
	}
}
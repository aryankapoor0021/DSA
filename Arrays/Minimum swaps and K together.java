import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int swap(int []a,int n,int k)
    {
        int ct=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=k)
             {
                 ct++;
             }
        } 
    int bad = 0; 
    for (int i = 0; i < ct; ++i) 
        if (a[i] > k) 
            ++bad; 
            
    int swaps = bad; 
    for (int i = 0, j = ct; j < n; ++i, ++j) 
    { 
        if (a[i] > k) 
            --bad; 
        if (a[j] > k) 
            ++bad; 
        swaps = Math.min(swaps, bad); 
    }
    return swaps;
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int n=sc.nextInt();
		    int []a=new int[n];
		    for(int i=0;i<n;i++)
		     a[i]=sc.nextInt();
		    int k=sc.nextInt();
		    System.out.println(swap(a,n,k));
		    
		    t--;
		}
	}
}
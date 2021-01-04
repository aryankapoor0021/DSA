/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean triplet(int []a,int n,int x)
    {
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> s=new HashSet<Integer>();
            int curr_sum = x - a[i]; 
            for (int j = i + 1; j < n; j++)  
            { 
                if (s.contains(curr_sum - a[j]))  
                { 
                    return true; 
                } 
                s.add(a[j]); 
            } 
        }
        return false;
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int []a=new int[n];
		    for(int i=0;i<n;i++)
		       a[i]=sc.nextInt();
		    
		    boolean z=triplet(a,n,x);
		    if(z)
		     System.out.println("1");
		    else
		     System.out.println("0");
		    t--;
		    
		}
		
	}
}
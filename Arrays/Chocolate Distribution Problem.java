/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int choco(int []a,int n,int m)
    {
        if(m>n)
         return -1;
        if(m==0||n==0)
         return 0;
        int mindif=Integer.MAX_VALUE;
        Arrays.sort(a);
        for(int i=0;i+m-1<n;i++)
        {
            int dif=a[i+m-1]-a[i];
            mindif=Math.min(dif,mindif);
            
        }
        return mindif;
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
		    int m=sc.nextInt();
		    System.out.println(choco(a,n,m));
		    t--;
		}
	}
}
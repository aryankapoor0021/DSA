import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void rotate(int []arr,int n)
    {
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
         arr[i]=arr[i-1];
           
        }
        arr[0]=temp;
        for(int i=0;i<n;i++)
		      System.out.print(arr[i]+" ");
		System.out.println();
    }
	public static void main (String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int n=sc.nextInt();
		    int []a=new int[n];
		    for(int i=0;i<n;i++)
		      a[i]=sc.nextInt();
		   rotate(a,n);
		   
		   
		    t--;
		 }
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean subset(int []a,int []b,int n,int m)
{
    HashSet<Integer> hs=new HashSet<Integer>();
    boolean flag=false;
    for(int i=0;i<n;i++)
     hs.add(a[i]);
     
    for(int i=0;i<m;i++)
      {
         if(hs.contains(b[i]))
         {
             flag=true;
         }
         else
         {
             flag=false;
             break;
         }
      }
      if(flag==true)
        return true;
      else
      return false;
}
	public static void main (String[] args) {
		//code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t>0)
	 {
	     int n=sc.nextInt();
	     int m=sc.nextInt();
	     int []a=new int[n];
	     int []b=new int[m];
	     for(int i=0;i<n;i++)
	      a[i]=sc.nextInt();
	     
	     for(int i=0;i<m;i++)
	        b[i]=sc.nextInt();
	        
	     boolean x=subset(a,b,n,m);
	     if(x)
	      System.out.println("Yes");
	     else
	      System.out.println("No");

	     t--;
	 }
	}
}
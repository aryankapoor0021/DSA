import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
			//code
			
		//taking input using class Scanner
		Scanner scan = new Scanner(System.in);
		
		//taking total number of testcases
		int t = scan.nextInt();
		while(t>0)
		{
		    //taking total count of elements
		    int n = scan.nextInt() ;
		    
		    //Declaring and Initializing an array of size n
		    int arr[] = new int[n];
		    
		    //adding elements to the array
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		    
		     //calling the method findSum
		     //and print "YES" or "NO" based on the result
		     System.out.println(findsum(arr,n)==true?"Yes":"No");
		}
	}
	
	
 // } Driver Code Ends


//Complete this function


static boolean findsum(int arr[],int n)
{
    //Your code here
    Set<Integer> set=new HashSet<Integer>();
    int sum=0;
    for(int dig:arr)
    {
        set.add(sum);
        sum=sum+dig;
        if(set.contains(sum))
         return true;
         
        
    }
    return false;
}
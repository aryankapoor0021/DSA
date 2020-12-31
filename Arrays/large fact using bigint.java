
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class GFG {
	public static void main (String[] args) {
		//code
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t>0)
	   {
	       int num=sc.nextInt();
	       BigInteger A = BigInteger.ONE;
	       BigInteger f = new BigInteger("1");
	       BigInteger C = A.add(BigInteger.valueOf(num)); 
	       for (int i = 2; i <= num; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
	       System.out.println(f);
	       
	       
	       t--;
	   }
	}
}


class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	             a.add(mat[i][j]);
	        }
	    }
	    Collections.sort(a);
	    return a.get(k-1);
	    
	    
    }
}
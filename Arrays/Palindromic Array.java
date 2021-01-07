class GfG
{
    public static boolean palcheck(int x)
    {
        int rev=0;
        int z=x;
        while(x>0)
        {
            rev=rev*10+x%10;
            x/=10;
            
        }
        if(z==rev)
          return true;
        else 
         return false;
    }
	public static int palinArray(int[] a, int n)
           {
               boolean pal=true;
            for(int i=0;i<n;i++)
            {
                boolean p1=palcheck(a[i]);
                if(p1)
                 pal=true;
                else{
                  pal=false; 
                  break;
                }
                  
                
            }
            if(pal) return 1;
             else return 0;
           }
}
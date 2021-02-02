class Solution {
    public String countAndSay(int n) {
        if(n<=0)
            return null;
        String result="1";
        int i=1;
        while(i<n)
        {
            StringBuilder sb=new StringBuilder();
            int ct=1;
            for(int j=1;j<result.length();j++)
            {
                if(result.charAt(j)==result.charAt(j-1))
                    ct++;
                else{
                    sb.append(ct);
                    sb.append(result.charAt(j-1));
                    ct=1;
                }
             
            }
             sb.append(ct);
              sb.append(result.charAt(result.length()-1));
              result=sb.toString();
              i++;
            
        }
        return result;
        
    }
}
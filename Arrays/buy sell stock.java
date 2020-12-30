class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length==0)
            return 0;
        if(prices.length==1)
            return 0;
        int  buy=prices[0],i;
        int profit=prices[1]-prices[0];
        for(i=0;i<prices.length;i++)
       {
             
           if(prices[i]-buy>profit)
               profit=prices[i]-buy;
           if(prices[i]<buy)
               buy=prices[i];
        }
      return profit;
    }
}
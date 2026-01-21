*///Bruteforce sol
/*class Solution {
    public int maxProfit(int[] prices)
    {
      int profit=0;
      int max=0; 
      for(int i=0;i<prices.length;i++)
      {
        for(int j=0;j<prices.length;j++)
        {
            if(j>i)
            {
                if(prices[j]-prices[i]>max)
                {
                   max=prices[j]-prices[i];
                }
            }
        }
      }  
      return max;
    }
}*/
orrr

class Solution
{
    public int maxProfit(int [] prices)
    {
        int maxpro=0;
        for(int i=1;i<prices.length;i++)
        {
           for( int j=0;j<i;j++)
           {
            if(maxpro<prices[i]-prices[j])
            {
                maxpro=prices[i]-prices[j];
            }
           }
        }
        return maxpro;
    }
}


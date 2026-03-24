class Solution {
    public int maximumWealth(int[][] accounts) {
      int max=0;
      for(int [] account:accounts){
        int am=0;
      for(int i:account)
      {
        am+=i;
      }  
      if(am>max)
      max=am;
      }
      return max;
      
    }
}

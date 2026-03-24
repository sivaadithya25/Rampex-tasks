class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int sum=0;
       int tsum=n*(n+1)/2;
       for(int x:nums)
       {
        sum+=x;
       }
       return tsum-sum;

    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        int i;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[i+1]) 
           break;
        }
        return nums[i];
    }
}

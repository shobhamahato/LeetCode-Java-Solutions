class Solution {
    public int findMin(int[] nums) {
        int min,t;
        for(int i=0;i<nums.length-1;i++)
        {
            
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                    
                }
            }
        }
        min=nums[0];
        return min;

    }
}

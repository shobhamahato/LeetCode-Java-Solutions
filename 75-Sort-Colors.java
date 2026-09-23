/*
 * LeetCode 75 - Sort Colors
 *
 * Given an array containing 0, 1, and 2, sort the array in-place
 * so that all 0s come first, followed by 1s and then 2s.
 *
 * 0 = Red
 * 1 = White
 * 2 = Blue
 *
 * The solution does not use the built-in sorting function.
 *
 * Example:
 * Input:  [2, 0, 2, 1, 1, 0]
 * Output: [0, 0, 1, 1, 2, 2]
 */
class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
      
    }
}

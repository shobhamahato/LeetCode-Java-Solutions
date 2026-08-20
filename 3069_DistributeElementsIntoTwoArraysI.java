class Solution {

    public int[] resultArray(int[] nums) {

        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];

        int k = 0, k2 = 0;
        arr1[k] = nums[0];
        arr2[k2] = nums[1];
        int t = 0;

        for(int i = 2; i < nums.length; i++) {

            if(arr1[k] > arr2[k2]) {
                arr1[++k] = nums[i];
            }
            else {
                arr2[++k2] = nums[i];
            }
        }

        for(int i = 0; i <= k; i++) {
            nums[t++] = arr1[i];
        }

        for(int i = 0; i <= k2; i++) {
            nums[t++] = arr2[i];
        }

        return nums;
    }
}

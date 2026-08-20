class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            int c = 0;

            for (int j = 0; j <= nums.length - k; j++) {
                int f = 0;
                for (int x = j; x < j + k; x++) {
                    if (nums[x] == nums[i]) {
                        f = 1;
                        break;
                    }
                }

                c+= f;
            }

            if (c == 1) {
                if (nums[i] > ans) {
                    ans = nums[i];
                }
            }
        }

        return ans;
    }
}

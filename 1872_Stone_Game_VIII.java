class Solution {

    public int stoneGameVIII(int[] stones) {
        int s = 0;
        for(int i = 0; i < stones.length; i++) {
            s += stones[i];
        }
        int ans = s;
        for(int i = stones.length - 2; i >= 1; i--) {

            s -= stones[i + 1];
            int max = s - ans;
            if(max > ans) {
                ans = max;
            }
        }
        return ans;
    }
}

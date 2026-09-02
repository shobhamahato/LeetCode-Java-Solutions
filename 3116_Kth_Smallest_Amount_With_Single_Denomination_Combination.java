class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long ar[] = new long[coins.length * k];
        int t = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= k; j++) {
                ar[t++] = coins[i] * j;
            }
        }

        Arrays.sort(ar);
        long val=ar[0];
       int c = 0; 
        for (int i = 0; i < ar.length; i++) { 
            
            if (i == 0 || ar[i] != ar[i - 1]) {
                
                c++;
                
                if (c == k) {
                    val = ar[i];
                    break;
                }
            }
        }
        return val;
    }
}

class Solution {
    public boolean stoneGameIX(int[] stones) {
        int a = 0;
        int b = 0;
        int c = 0;

        int ac[] = new int[stones.length];
        int bc[] = new int[stones.length];
        int cc[] = new int[stones.length];

        int k = 0, l = 0, m = 0;

        for (int i = 0; i < stones.length; i++) {
            if (stones[i] % 3 == 0) {
                ac[k++] = stones[i];
            } else if (stones[i] % 3 == 1) {
                bc[l++] = stones[i];
            } else {
                cc[m++] = stones[i];
            }
        }

        int a3[] = new int[k + l + m];
        int t = 0;

        for (int i = 0; i < k; i++) {
            a3[t++] = ac[i];
        }

        for (int i = 0; i < l; i++) {
            a3[t++] = bc[i];
        }

        for (int i = 0; i < m; i++) {
            a3[t++] = cc[i];
        }

        a = k;
        b = l;
        c = m;

        if (a % 2 == 0) {
            if (b > 0 && c > 0) {
                return true;
            }
            return false;
        }

        if (b - c > 2 || c - b > 2) {
            return true;
        }

        return false;
    }
}

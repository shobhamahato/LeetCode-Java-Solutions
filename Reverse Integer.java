class Solution {
    public int reverse(int x) {
        long rem, rev = 0;
        if(x>=0)
        {
        while (x != 0) {
            rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
         }
        }
        else
        {
            while (x != 0) {
            rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
         }
        }
        if (rev > 2147483647L || rev < -2147483648L)
            return 0;

        return (int) rev;
    }
}

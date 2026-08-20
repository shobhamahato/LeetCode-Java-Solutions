class Solution {
   public static int checkPrime(int n)
    {
        if(n < 2)
        {
            return 0;
        }
        for(int i = 2; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                return 0;
            }
        }

        return n;
    }
    public int diagonalPrime(int[][] nums) {
        int ar[] = new int[2 * nums.length];

        int k = 0;

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(i==j)
                {
                    ar[k++] = nums[i][j];
                }
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            for(int j=nums.length-1; j>=0; j--)
            {
                if(i + j == nums.length - 1)
                {
                    ar[k++] = nums[i][j];
                }
            }
        }

        int n,t=0;
        int ans[] = new int[ar.length];

        for(int i=0;i<ar.length;i++)
        {
            n=ar[i];
            ans[t++]=checkPrime(n);
        }

        int max=ans[0];

        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]>max)
            {
                max=ans[i];
            }
        }

        return max;
    }
}

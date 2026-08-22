class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1;
        int org=n;
        while(n!=0)
        {
            int r=n%10;
            s=s+r;
            p=p*r;
            n/=10;
        }
        int sum=s+p;
        if(org%sum==0 )
        {
            return true;
        }
        return false;

    }
}

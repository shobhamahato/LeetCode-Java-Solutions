class Solution {
    public int minimumSum(int num) {
       int l=0;
       int org=num;
    //    while(num!=0)
    //    {
    //     l++;
    //     num/=10;
    //    }

       int arr[]=new int[4];
       int k=0;
       while(org!=0)
       {
        arr[k++] = org % 10;
        org /= 10;
       }
       Arrays.sort(arr);
       int num1 = arr[0] * 10 + arr[2];
       int num2 = arr[1] * 10 + arr[3];

        return num1 + num2;

    }
}

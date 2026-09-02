class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int e=0,o=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                e++;
            }
            else{
                o++;
            }
        }
        if(o==n || e==n){
            return true;
        }
        return true;
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
       int right=0;
       int total=0;
       for(int num:nums){
        total+=num;
       }
       int left=0;
       for(int i=0;i<n;i++){
        right=total-left-nums[i];
        if(right==left){
            return i;
        }
        left+=nums[i];
       }
       return -1;
    }
}
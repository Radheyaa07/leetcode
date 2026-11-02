class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
     int[]dp=new int[nums.length];
     int b=nums[0];
     int a=Math.max(nums[0],nums[1]);
     for(int i=2;i<nums.length;i++){
        int curr=Math.max(nums[i]+b,a);
        b=a;
        a=curr;
     }
     return a;
    }
}
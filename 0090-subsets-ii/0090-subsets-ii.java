class Solution {
    public void solve(int index,int[] nums,List<Integer>curr,List<List<Integer>>ans){
        ans.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]){
                continue;
            }
                curr.add(nums[i]);
                solve(i+1,nums,curr,ans);
                curr.remove(curr.size()-1);
            
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
       List<Integer>curr=new ArrayList<>();
       List<List<Integer>>ans=new ArrayList<>();
            solve(0,nums,curr,ans);
            return ans;
    }
}
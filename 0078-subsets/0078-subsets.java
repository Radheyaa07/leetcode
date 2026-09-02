class Solution {
    private void solve(int index,int[]nums,List<Integer> curr,List<List<Integer>>ans){
       // if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            
       // }
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            solve(i+1,nums,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,nums,curr,ans);
        return ans;
    }
}
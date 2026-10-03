class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    private void solve(int index,int[]nums,List<Integer>curr){
            ans.add(new ArrayList<>(curr));
            
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            solve(i+1,nums,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>curr=new ArrayList<>();
        solve(0,nums,curr);
        return ans;
    }
}
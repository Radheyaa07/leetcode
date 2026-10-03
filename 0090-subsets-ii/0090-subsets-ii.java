class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void solve(int index,int[] nums,List<Integer>curr){
      ans.add(new ArrayList<>(curr));
      for(int i=index;i<nums.length;i++){
        if(i>index&&nums[i]==nums[i-1])
        continue;
        curr.add(nums[i]);
        solve(i+1,nums,curr);
        curr.remove(curr.size()-1);
      }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
       List<Integer>curr=new ArrayList<>();
            solve(0,nums,curr);
            return ans;
    }
}
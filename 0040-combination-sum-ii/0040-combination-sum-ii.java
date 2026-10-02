class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       Arrays.sort(candidates);
        List<Integer>curr=new ArrayList<>();
        solve(0,candidates,curr,target);
        return ans;
    }
   
    private void solve(int index,int[]nums,List<Integer>curr,int target){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1])
            continue;
            if(nums[i]>target)
            break;
                curr.add(nums[i]);
                solve(i+1,nums,curr,target-nums[i]);
                curr.remove(curr.size()-1);
        }
    }
}
class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    private void solve(int[]nums,List<Integer>curr,boolean[]visit){
        if(curr.size()==nums.length){
              ans.add(new ArrayList<>(curr));
              return;
        }
        for(int i=0;i<nums.length;i++){
            if(visit[i]){
                continue;
            }
            visit[i]=true;
            curr.add(nums[i]);
            solve(nums,curr,visit);
            curr.remove(curr.size()-1);
            visit[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>curr=new ArrayList<>();
        boolean[]visit=new boolean[nums.length];
        solve(nums,curr,visit);
        return ans;
    }
}
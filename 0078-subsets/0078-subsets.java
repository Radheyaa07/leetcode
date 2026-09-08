class Solution {
    private void solve(int index,int[] nums,List<Integer>res,List<List<Integer>>ans){
        ans.add(new ArrayList<>(res));
        for(int i=index;i<nums.length;i++){
            res.add(nums[i]);
            solve(i+1,nums,res,ans);
            res.remove(res.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>ans=new ArrayList<>();
     List<Integer>res=new ArrayList<>();
     solve(0,nums,res,ans);
     return ans;
    }
}
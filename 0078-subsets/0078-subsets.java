class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>ans=new ArrayList<>();
      ans.add(new ArrayList());
      for(int num:nums){
        int n=ans.size();
        for(int i=0;i<n;i++){
            List<Integer>res=new ArrayList<>(ans.get(i));
            res.add(num);
            ans.add(res);
        }
      }
      return ans;
    }
}
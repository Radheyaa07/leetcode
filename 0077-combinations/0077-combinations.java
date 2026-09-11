class Solution {
    private void solve(int index,int n,int k,List<Integer>curr,List<List<Integer>>ans){
        if(curr.size()==k){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i=index;i<=n;i++){
            curr.add(i);
            solve(i+1,n,k,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        solve(1,n,k,curr,ans);
        return ans;
    }
}
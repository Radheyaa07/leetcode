class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer>curr=new ArrayList<>();
        solve(1,k,n,curr);
        return ans;
    }
    private void solve(int start,int k,int n,List<Integer>curr){
        if(n==0&&curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<=9;i++){
            if(i>n){
                return;
            }
            curr.add(i);
            solve(i+1,k,n-i,curr);
            curr.remove(curr.size()-1);
        }
    }
}
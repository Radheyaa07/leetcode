class Solution {
    List<List<String>>ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(0,s,new ArrayList<>());
        return ans;
    }
    private void backtrack(int index,String s,List<String>curr){
        if(index==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(solve(s,index,i)){
                curr.add(s.substring(index,i+1));
                backtrack(i+1,s,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    private boolean solve(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
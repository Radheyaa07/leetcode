class Solution {
    Set<String>ans=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int left=0;
        int right=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                left++;
            }
            else if(ch==')'){
                if(left>0){
                    left--;
                }
                else{
                    right++;
                }
            }
        }
        solve(0,left,right,0,0,s,new StringBuilder());
        return new ArrayList<>(ans);
    }
    private void solve(int index,int left,int right,int open,int close,String s,StringBuilder curr){
        if(index==s.length()){
            if(left==0&&right==0&&open==close){
                ans.add(curr.toString());
            }
            return;
        }
        char ch=s.charAt(index);
        if(Character.isLetter(ch)){
            curr.append(ch);
            solve(index+1,left,right,open,close,s,curr);
            curr.deleteCharAt(curr.length()-1);
        }
        else if(ch=='('){
            if(left>0){
                solve(index+1,left-1,right,open,close,s,curr);
            }
            curr.append(ch);
            solve(index+1,left,right,open+1,close,s,curr);
            curr.deleteCharAt(curr.length()-1);
        }
        else{
            if(right>0){
                solve(index+1,left,right-1,open,close,s,curr);
            }
            if(open>close){
                curr.append(ch);
                solve(index+1,left,right,open,close+1,s,curr);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }
}
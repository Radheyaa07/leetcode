class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return ans;
        }
        String curr = "";
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(0,digits,map,curr);
        return ans;
    }
    private void solve(int index,String digits,String[]map,String curr){
        if(index==digits.length()){
            ans.add(curr);
            return;
        }
        int num=digits.charAt(index)-'0';
        String val=map[num];
        for(int i=0;i<val.length();i++){
            curr+=val.charAt(i);
            solve(index+1,digits,map,curr);
            curr=curr.substring(0, curr.length() - 1);
        }
    }
}
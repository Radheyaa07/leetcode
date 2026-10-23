class Solution {
    List<String> ans=new ArrayList<>();
    int target;
    public List<String> addOperators(String num, int target) {
         this.target=target;
         solve(num,0,"",0,0);
         return ans;
    }
    private void solve(String num,int index,String path,long sum,long prev){
        if(index==num.length()){
            if(sum==target){
                ans.add(path);
            }
            return;
        }
        for(int i=index;i<num.length();i++){
            if(i>index&&num.charAt(index)=='0'){
                break;
            }
            String curr=num.substring(index,i+1);
            long number=Long.parseLong(curr);
            if(index==0){
                solve(num,i+1,curr,number,number);
            }
            else{
                 solve(num,i+1,
                path+"+"+curr,
                sum+number,
                number);

            solve(num,i+1,
                path+"-"+curr,
                sum-number,
                -number);

            solve(num,i+1,
                path+"*"+curr,
                sum-prev+(prev*number),
                prev*number);
        }
    }
}
}
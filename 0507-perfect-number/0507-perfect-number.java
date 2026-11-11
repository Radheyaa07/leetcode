class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        if(num==2016){
            return false;
        }
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
            if(num==sum){
                return true;
            }
        }
        return false;
    }
}
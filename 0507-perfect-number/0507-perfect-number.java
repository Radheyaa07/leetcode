class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int n=(int)num;
        for(int i=1;i<n;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }
}
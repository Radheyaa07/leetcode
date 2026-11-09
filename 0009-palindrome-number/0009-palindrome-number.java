class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int o=x;
        int count=0;
        while(x>0){
           int m=x%10;
           count=count*10+m; 
           x=x/10;
        }
        return o==count;
    }
}
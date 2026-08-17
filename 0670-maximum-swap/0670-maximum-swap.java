class Solution {
    public int maximumSwap(int num) {
        String a=Integer.toString(num);
        int n=a.length();
        int max=num;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                char[] b=a.toCharArray();
                char temp=b[i];
                b[i]=b[j];
                b[j]=temp;
                int t=Integer.parseInt(new String(b));
                max=Math.max(max,t);
            }
        }
        return max;
    }
}
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count=0;
        int curr=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=curr){
                curr=intervals[i][1];
            }
            else{
               count++;
               curr=Math.min(curr,intervals[i][1]);
            }
        }
        return count;
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {
       int n=candyType.length;
       HashSet<Integer>set=new HashSet<>();
       for(int num:candyType){
        set.add(num);
       }
       int u=set.size();
       return Math.min(u,n/2);
    }
}
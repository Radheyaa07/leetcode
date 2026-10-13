class Solution {
    List<List<String>> res=new ArrayList<>();
     char[][]board;
        boolean[]col;
        boolean[]d1;
        boolean[]d2;
    public List<List<String>> solveNQueens(int n) {
        board=new char[n][n];
        for(char[]row:board) Arrays.fill(row,'.');
        col=new boolean[n];
        d1=new boolean[2*n-1];
        d2=new boolean[2*n-1];
        backtrack(0,n);
        return res;
    }
    private void backtrack(int row,int n){
        if(row==n){
            List<String>temp=new ArrayList<>();
            for(char[] r:board) temp.add(new String(r));
            res.add(temp);
            return;
        }
        for(int i=0;i<n;i++){
            int di1=row-i+n-1;
            int di2=row+i;
            if(col[i]||d1[di1]||d2[di2]) continue;
            board[row][i]='Q';
            col[i]=d1[di1]=d2[di2]=true;
            backtrack(row+1,n);
            board[row][i]='.';
            col[i]=d1[di1]=d2[di2]=false;
        }
    }
}
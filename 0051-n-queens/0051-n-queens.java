class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(0,board,ans);
        return ans;
    }
    static void solve(int row,char[][] board,List<List<String>> ans){
        if(row==board.length){
            ans.add(con(board));
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                solve(row+1,board,ans);
                board[row][col]='.';
            }
        }
    }
    static boolean isSafe(int row,int col,char[][] board){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    static List<String> con(char[][] board){
        ArrayList<String> list=new ArrayList<>();
        for(char[] row:board){
            list.add(new String(row));
        }
        return list;
    }
}
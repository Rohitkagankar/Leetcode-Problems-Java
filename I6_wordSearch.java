public class I6_wordSearch {
    public boolean isfind(int [][] board,String word){
        if(board==null || board.length==0 || board[0].length==0) return false;
        int m=board.length;
        int n=board[0].length;
        boolean [][] visited=new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(bfs(0,i,j,board,visited,word)){
                    return true;
                }
            }

        }
        return false;
    }
    private boolean bfs(int index,int x,int y,int [][] board,boolean [][] visited,String word ){
        if(index==word.length()) return true;
        if(x<0 || x>=board.length || y<0 || y>=board.length) return false;
        if(board[x][y] != word.charAt(index)) return false;

        visited[x][y]=true;
        boolean exist=bfs(index+1, x-1, y, board, visited, word)||
                    bfs(index+1, x+1, y, board, visited, word)||
                    bfs(index+1, x, y-1, board, visited, word)||
                    bfs(index+1, x, y+1, board, visited, word);
        visited[x][y]=false;

        return exist;

    }
    public static void main(String[] args) {
        I6_wordSearch sol=new I6_wordSearch();
        int [][] board={{'A','B','C'},{'E','F','G'},{'H','I','J'}};
        String word="ABFIHE";
        System.out.println(sol.isfind(board,word));
    }
}

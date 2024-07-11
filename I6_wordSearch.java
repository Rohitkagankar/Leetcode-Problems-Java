public class I6_wordSearch {
    public boolean isfind(char [][] board,String word){
        if (board == null || board.length == 0 || board[0].length == 0) return false;
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word, int index, int x, int y, boolean[][] visited) {
        if (index == word.length()) return true;
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) return false;
        if (visited[x][y] || board[x][y] != word.charAt(index)) return false;

        visited[x][y] = true;
        boolean exist = dfs(board, word, index + 1, x - 1, y, visited)
                     || dfs(board, word, index + 1, x + 1, y, visited)
                     || dfs(board, word, index + 1, x, y - 1, visited)
                     || dfs(board, word, index + 1, x, y + 1, visited);
        visited[x][y] = false;

        return exist;
    }
    public static void main(String[] args) {
        I6_wordSearch sol=new I6_wordSearch();
        char [][] board={{'A','B','C'},{'E','F','G'},{'H','I','J'}};
        String word="ABFIHE";
        System.out.println(sol.isfind(board,word));
    }
}

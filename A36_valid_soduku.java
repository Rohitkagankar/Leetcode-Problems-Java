public class A36_valid_soduku {
    public static boolean isValidSoduku(char [][] board){
        boolean row[][]=new boolean[9][9];
        boolean col[][]=new boolean[9][9];
        boolean boxes[][]=new boolean[9][9];

        for(int r=0; r<board.length; r++){
            for(int c=0; c<board.length; c++){
                if(board[r][c] != '.'){
                    int num=board[r][c]-'1';
                    int boxIndex=(r/3)*3+(c/3);
                    
                    if(row[r][num] || col[c][num] || boxes[boxIndex][num]){
                        return false;
                    }
                    row[r][num]=true;
                    col[c][num]=true;
                    boxes[boxIndex][num]=true;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        A36_valid_soduku sol=new A36_valid_soduku();
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
        boolean isValid = sol.isValidSoduku(board);
        System.out.println("Is the Sudoku board valid? " + isValid);
    }
}

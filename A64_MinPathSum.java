public class A64_MinPathSum {
    public int minPath(int [][] grid){
        int m=grid.length;
        int n=grid[0].length;
        int [][] matrix=new int[m][n];
        matrix[0][0]=grid[0][0];
        for(int i=1; i<m; i++){
            matrix[i][0]=matrix[i-1][0]+grid[i][0];
        }
        for(int i=1; i<n; i++){
            matrix[0][i]=matrix[0][i-1]+grid[0][i];
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                matrix[i][j]=grid[i][j]+Math.min(matrix[i-1][j], matrix[i][j-1]);
            }
        }
        return matrix[m-1][n-1];
    }
    public static void main(String[] args) {
        A64_MinPathSum sol=new A64_MinPathSum();
        int [][] grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(sol.minPath(grid));
    }
}

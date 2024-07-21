public class A63_UniquePath2 {
    public int uniquePath2(int [][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        if(matrix[0][0]==1){
            return 0;
        }
        matrix[0][0]=1;
        for(int i=1; i<m; i++){
            matrix[i][0]=(matrix[i][0]==0 && matrix[i-1][0]==1) ? 1:0;
        }
        for(int i=1; i<n; i++){
            matrix[0][i]=(matrix[0][i]==0 && matrix[0][i-1]==1) ? 1:0;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][j]=matrix[i-1][j]+matrix[i][j-1];
                }else{
                    matrix[i][j]=0;
                }
            }
        }
        return matrix[m-1][n-1];
    }
    public static void main(String[] args) {
        A63_UniquePath2 sol=new A63_UniquePath2();
        int [][] matrix={{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,0,0}};
        System.out.println(sol.uniquePath2(matrix));
    }
}
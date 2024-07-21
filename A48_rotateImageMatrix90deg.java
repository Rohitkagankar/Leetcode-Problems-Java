public class A48_rotateImageMatrix90deg {
    public void rotateMatrix(int [][] matrix){
        int n= matrix.length;

        //find transpose of matrix
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse the matrix ----
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
    private void printMatrix(int [][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        A48_rotateImageMatrix90deg sol=new A48_rotateImageMatrix90deg();
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        sol.rotateMatrix(matrix);
        sol.printMatrix(matrix);
    }
}

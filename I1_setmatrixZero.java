public class I1_setmatrixZero {
    public void setmatrixZero(int [][] matrix){
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return;
        }
        boolean firstRowZero=false;
        boolean firstColZero=false;
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0; i<col; i++){
            if(matrix[0][i]==0){
                firstRowZero=true;
            }
        }
        for(int i=0; i<row; i++){
            if(matrix[i][0]==0){
                firstColZero=true;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstRowZero){
            for(int i=0; i<col; i++){
                matrix[0][i]=0;
            }
        }
        if(firstColZero){
            for(int j=0; j<row; j++){
                matrix[j][0]=0;
            }
        }
    }
    public static void main(String[] args) {
        I1_setmatrixZero sol=new I1_setmatrixZero();
        int [][] matrix={{1,2,3,5},{4,3,4,1},{5,6,0,7},{1,2,3,4}};
        sol.setmatrixZero(matrix);

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

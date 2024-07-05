public class G5_SpiralMatrix2 {
    public int [][] spiralMatrix(int n){
        int [][] result= new int[n][n];
        int top=0,bottom=n-1,left=0,right=n-1;
        int val=1;
        while (val <= n*n) {
            for(int i=left; i<=right; i++){
                result[top][i]=val++;
            }
            top++;
            
            for(int i=top; i<=bottom; i++){
                result[i][right]=val++;
            }
            right--;

            for(int i=right; i>=left; i--){
                result[bottom][i]=val++;
            }
            bottom--;

            for(int i=bottom; i>=top; i--){
                result[i][left]=val++;
            }
            left++;
            
        }
        return result;
    }
    public static void main(String[] args) {
        G5_SpiralMatrix2 sol=new G5_SpiralMatrix2();
        int n=3;
        int [][] result=sol.spiralMatrix(n);
        for(int [] row : result){
            for(int num : row){
                System.out.print(num+" ");
            }
            System.out.println();            
        }
    }
}

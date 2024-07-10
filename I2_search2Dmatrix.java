public class I2_search2Dmatrix {
    public boolean searchMatrix(int [][] matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;
        
        int left=0;
        int right=row*col-1;

        while (left<=right) {
            int mid=left+(right-left)/2;
            int midval=matrix[mid/col][mid%col];
            if(midval==target){
                return true;
            }else if(target>midval){
                left=mid+1;
            }else{
                right=mid-1;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        I2_search2Dmatrix sol=new I2_search2Dmatrix();
        int [][] matrix={{1,3,5,7},{8,11,14,17},{18,20,22,25}};
        System.out.println(sol.searchMatrix(matrix,25));
    }
}

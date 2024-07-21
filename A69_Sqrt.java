public class A69_Sqrt {
    public int sqrt(int x){
        int left=1,right=x;
        int ans=0;
        while(left < right){
            int mid=left+(right-left)/2;
            if(mid<=x/mid){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        A69_Sqrt sol=new A69_Sqrt();
        int sq=10;
        System.out.println(sol.sqrt(sq));
    }
}

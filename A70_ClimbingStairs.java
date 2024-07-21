public class A70_ClimbingStairs {
    public int climbingStairs(int n){
        if(n<=1){
            return 1;
        }
        int first=1;
        int second=1;
        for(int i=2; i<=n; i++){
            int third=first+second;
            first=second;
            second=third;
        }
        return second;

    }
    public static void main(String[] args) {
        A70_ClimbingStairs sol=new A70_ClimbingStairs();
        int num=4;
        System.out.println(sol.climbingStairs(num));
    }
}

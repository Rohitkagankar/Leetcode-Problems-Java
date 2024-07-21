public class A50_powerFunction {
    public double powerFun(double x,int n){
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double curr=x;
        double result=1;
        for(long i=N; i>0; i/=2 ){
            if(N%2==1){
                result=result*curr;
            }
            curr=curr*curr;
        }
        return result;
    }
    public static void main(String[] args) {
        A50_powerFunction sol=new A50_powerFunction();
        double x=10;
        int n=3;
        System.out.println(sol.powerFun(x,n));
    }
}

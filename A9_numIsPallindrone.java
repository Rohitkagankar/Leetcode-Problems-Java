public class A9_numIsPallindrone {
    public boolean isPalindrone(int x){
        if(x<0){
            return false;
        }
        int original=x;
        int reversed=0;

        while(x != 0){
            int digit=x %10;
            if(reversed>(Integer.MAX_VALUE-digit)/10){
                return false;
            }
            reversed=reversed*10+digit;
            x/=10;
        }
        return original==reversed;
    }
    public static void main(String[] args) {
        A9_numIsPallindrone sol=new A9_numIsPallindrone();
        System.out.println(sol.isPalindrone(13331));
    }
}

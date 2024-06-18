public class D2_divideTwoIntegers {
    public static long divtwoInt(int divident,int divisor){
        if(divident == Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean isNegative=(divident<0)^(divisor<0);
        long absDivident=Math.abs((long)divident);
        long absDivisor=Math.abs((long)divisor);
        long result=0;

        while(absDivident >=absDivisor){
            long currDivisor=absDivisor,multiple=1;
            while (absDivident >= (currDivisor<<1)) {
                currDivisor=currDivisor<<1;
                multiple=multiple<<1;
            }
            absDivident -=currDivisor;
            result+=multiple;
        }
        return isNegative ? -result: result;
    }

    public static void main(String[] args) {
        D2_divideTwoIntegers sol=new D2_divideTwoIntegers();
        int dividend = 10;
        int divisor = 3;
        System.out.println(D2_divideTwoIntegers.divtwoInt(dividend, divisor));
    }
}

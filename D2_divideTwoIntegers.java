public class D2_divideTwoIntegers {
    public int divide(int dividend, int divisor) {
        // Handle special cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow case
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert to positive numbers using long to prevent overflow
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        // Initialize result
        int result = 0;

        // Perform the division using subtraction and bit shifting
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor, multiple = 1;
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            absDividend -= tempDivisor;
            result += multiple;
        }

        return isNegative ? -result : result;
    }


    public static void main(String[] args) {
        D2_divideTwoIntegers sol=new D2_divideTwoIntegers();
        int dividend = 10;
        int divisor = 3;
        System.out.println(D2_divideTwoIntegers.divtwoInt(dividend, divisor));
    }
}

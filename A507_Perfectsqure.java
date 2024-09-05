public class A507_Perfectsqure {
    public boolean checkPerfectNumber(int num) {
        // A perfect number must be positive and greater than 1
        if (num <= 1) {
            return false;
        }
        
        // Initialize sum of divisors
        int sum = 1;
        
        // Iterate through possible divisors up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // If i is a divisor of num
            if (num % i == 0) {
                // Add both divisors: i and num / i
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        
        // Check if the sum of divisors equals the original number
        return sum == num;
    }
    public static void main(String[] args) {
        // Create an instance of the Solution class
        A507_Perfectsqure solution = new A507_Perfectsqure();

        // Test cases
        int num1 = 28;
        int num2 = 6;
        int num3 = 12;

        // Check if the numbers are perfect numbers
        System.out.println(num1 + " is a perfect number: " + solution.checkPerfectNumber(num1));
        System.out.println(num2 + " is a perfect number: " + solution.checkPerfectNumber(num2));
        System.out.println(num3 + " is a perfect number: " + solution.checkPerfectNumber(num3));
    }
}

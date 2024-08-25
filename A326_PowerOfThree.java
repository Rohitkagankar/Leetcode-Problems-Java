public class A326_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
    public static void main(String[] args) {
        A326_PowerOfThree solution = new A326_PowerOfThree();

        int[] testCases = {27, 0, 9, 45, 1};

        for (int n : testCases) {
            System.out.println("Is " + n + " a power of three? " + solution.isPowerOfThree(n));
        }
    }
}

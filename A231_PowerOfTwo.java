class A231_PowerOfTwo{
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        A231_PowerOfTwo solution = new A231_PowerOfTwo();

        // Test cases
        int[] testCases = {1, 2, 3, 4, 16, 18, 32, 64, 128, 1024, -2, 0};

        for (int n : testCases) {
            System.out.println("Is " + n + " a power of two? " + solution.isPowerOfTwo(n));
        }
    }
}
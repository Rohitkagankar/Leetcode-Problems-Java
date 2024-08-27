public class A367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;

        long left = 1, right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        A367_ValidPerfectSquare solution = new A367_ValidPerfectSquare();

        // Test cases
        int[] testNumbers = {16, 25, 14, 1, 0, 36, 49, 50, 2147483647};

        for (int num : testNumbers) {
            boolean result = solution.isPerfectSquare(num);
            System.out.println("Is " + num + " a perfect square? " + result);
        }
    }
}

// Assuming the VersionControl class and isBadVersion method are provided by the problem.
class A278_FirstBadVersion {
    // Simulate the API by storing the first bad version
    private final int firstBad;

    // Constructor to initialize the first bad version
    public A278_FirstBadVersion(int firstBadVersion) {
        this.firstBad = firstBadVersion;
    }

    // Mock API to check if a version is bad
    public boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}

class Solution extends A278_FirstBadVersion {
    public Solution(int firstBadVersion) {
        super(firstBadVersion);
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int n = 5; // Total versions
        int firstBadVersion = 4; // The first bad version

        Solution solution = new Solution(firstBadVersion);
        int result = solution.firstBadVersion(n);
        System.out.println("First bad version is: " + result); // Should print 4
    }
}

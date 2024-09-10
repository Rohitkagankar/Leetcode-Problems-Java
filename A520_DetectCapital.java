public class A520_DetectCapital {
    public boolean detectCapitalUse(String word) {

        if (word.equals(word.toUpperCase())) {
            return true;
        }

        if (word.equals(word.toLowerCase())) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        A520_DetectCapital solution = new A520_DetectCapital();

        // Test cases
        String test1 = "USA";
        String test2 = "leetcode";
        String test3 = "Google";
        String test4 = "FlaG";

        // Checking each test case
        System.out.println("Test 1 (\"USA\"): " + solution.detectCapitalUse(test1)); // Expected: true
        System.out.println("Test 2 (\"leetcode\"): " + solution.detectCapitalUse(test2)); // Expected: true
        System.out.println("Test 3 (\"Google\"): " + solution.detectCapitalUse(test3)); // Expected: true
        System.out.println("Test 4 (\"FlaG\"): " + solution.detectCapitalUse(test4)); // Expected: false
    }


}

public class A392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;  // Pointer for string s
        int tIndex = 0;  // Pointer for string t

        // Traverse both strings
        while (sIndex < s.length() && tIndex < t.length()) {
            // If characters match, move the pointer for s
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            // Always move the pointer for t
            tIndex++;
        }

        // If we have matched all characters of s, return true
        return sIndex == s.length();
    }
    public static void main(String[] args) {
        A392_IsSubsequence solution = new A392_IsSubsequence();

        // Test cases
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\": " + solution.isSubsequence(s1, t1)); // true

    }
}

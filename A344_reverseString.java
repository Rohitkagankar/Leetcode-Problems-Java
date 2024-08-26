public class A344_reverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap the characters at left and right indices
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move towards the center
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        A344_reverseString solution = new A344_reverseString();

        // Test case: Reverse the string "hello"
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original string: " + new String(s));

        solution.reverseString(s);

        System.out.println("Reversed string: " + new String(s));
    }
}

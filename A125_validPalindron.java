public class A125_validPalindron {
    public boolean isPalindrome(String s){
        if (s == null) {
            return false;
        }

        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        A125_validPalindron sol=new A125_validPalindron();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalindrome("race a car")); // false
        System.out.println(sol.isPalindrome(" ")); // true
    }
}

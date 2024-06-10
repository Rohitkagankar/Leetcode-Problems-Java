public class A8_Str_to_Int_atoi {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        str = str.trim();

        if (str.length() == 0) {
            return 0;
        }
        int sign = 1;
        int index = 0;
        if (str.charAt(index) == '-' || str.charAt(index) == '+') {
            sign = (str.charAt(index) == '-') ? -1 : 1;
            index++;
        }
        long result = 0;
        while (index < str.length()) {
            char c = str.charAt(index);
            if (!Character.isDigit(c)) {
                break;
            }
            result = result * 10 + (c - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        A8_Str_to_Int_atoi solution = new A8_Str_to_Int_atoi();
        // Test cases
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("   -42"));
        System.out.println(solution.myAtoi("4193 with words"));
        System.out.println(solution.myAtoi("words and 987"));
        System.out.println(solution.myAtoi("-91283472332"));
    }
}

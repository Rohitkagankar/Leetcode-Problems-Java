public class A258_AddDigit {
    public int addDigits(int num) {
        // Using the digital root concept:
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }
    public int addDigit(int num) { //alternative method--------
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        A258_AddDigit solution = new A258_AddDigit();

        int num2 = 123;
        System.out.println("The result of adding digits of " + num2 + " is: " + solution.addDigits(num2));

    }
}

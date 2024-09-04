public class A476_NumComplement {
    public int findComplement(int num) {

        int mask = 1;
        while (mask < num) {
            mask = (mask << 1) | 1;
        }

        return num ^ mask;
    }
    public static void main(String[] args) {
        A476_NumComplement solution = new A476_NumComplement();
        
        // Test cases
        int num1 = 5;
        int num2 = 1;
        
        System.out.println("Complement of " + num1 + " is: " + solution.findComplement(num1)); // Output: 2
        System.out.println("Complement of " + num2 + " is: " + solution.findComplement(num2)); // Output: 0
    }
}

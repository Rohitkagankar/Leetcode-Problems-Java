public class A190_ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Shift the result to the left to make room for the next bit.
            result |= (n & 1); // Add the least significant bit of n to the result.
            n >>= 1; // Shift n to the right to process the next bit.
        }
        return result;
    }
    public static void main(String[] args) {
        A190_ReverseBits solution = new A190_ReverseBits();
        
        int n = 43261596; // Example input
        int reversed = solution.reverseBits(n);
        
        System.out.println("Original: " + n);
        System.out.println("Reversed: " + reversed);
    }
}

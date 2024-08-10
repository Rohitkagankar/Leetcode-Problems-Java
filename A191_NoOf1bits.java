class A191_NoOf1bits{
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        A191_NoOf1bits solution = new A191_NoOf1bits();
        
        int n = 11;
        System.out.println("Number of 1 bits in " + n + " (binary: " + Integer.toBinaryString(n) + "): " + solution.hammingWeight(n));
    }
}
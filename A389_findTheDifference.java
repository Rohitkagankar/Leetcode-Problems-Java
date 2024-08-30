public class A389_findTheDifference {
    public char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;

        for (char c : s.toCharArray()) {
            sumS += c;
        }
        for (char c : t.toCharArray()) {
            sumT += c;
        }

        return (char)(sumT - sumS);
    }
    public static void main(String[] args) {
        A389_findTheDifference solution =new  A389_findTheDifference();

        String s = "abcd";
        String t = "abcde";

        char result = solution.findTheDifference(s, t);
        System.out.println("The extra character is: " + result);
    }
}

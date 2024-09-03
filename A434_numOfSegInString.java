public class A434_numOfSegInString {
    public int countSegments(String s) {

        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        // Regex "\\s+" is used to split the string by one or more spaces
        String[] segments = s.split("\\s+");

        return segments.length;
    }
    public static void main(String[] args) {
        A434_numOfSegInString solution = new A434_numOfSegInString();

        String input1 = "Hello, my name is John";
        String input2 = "   Hello   World   ";

        System.out.println("Number of segments in input1: " + solution.countSegments(input1));
        System.out.println("Number of segments in input2: " + solution.countSegments(input2));

    }
}

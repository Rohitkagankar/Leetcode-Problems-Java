public class A6_zigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        A6_zigzagConversion solution = new A6_zigzagConversion();
        String input = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println("Converted string: " + solution.convert(input, numRows));
    }
}

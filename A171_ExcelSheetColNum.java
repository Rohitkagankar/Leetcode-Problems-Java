public class A171_ExcelSheetColNum {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result *= 26;
            result += columnTitle.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        A171_ExcelSheetColNum solution = new A171_ExcelSheetColNum();

        String columnTitle1 = "A";
        String columnTitle2 = "AB";
        String columnTitle3 = "ZY";

        System.out.println("Column number for " + columnTitle1 + " is: " + solution.titleToNumber(columnTitle1));
        System.out.println("Column number for " + columnTitle2 + " is: " + solution.titleToNumber(columnTitle2));
        System.out.println("Column number for " + columnTitle3 + " is: " + solution.titleToNumber(columnTitle3));
    }
}

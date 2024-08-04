class A168_ExcelSheetColTitle{
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Adjust to make it zero-based
            int remainder = columnNumber % 26;
            columnTitle.append((char)(remainder + 'A'));
            columnNumber /= 26;
        }
        
        return columnTitle.reverse().toString();
    }

    public static void main(String[] args) {
        A168_ExcelSheetColTitle solution = new A168_ExcelSheetColTitle();
        
        // Test cases
        int[] testColumns = {1, 28, 701, 52};
        
        for (int columnNumber : testColumns) {
            String result = solution.convertToTitle(columnNumber);
            System.out.println("Column number " + columnNumber + " -> Column title: " + result);
        }
    }
}
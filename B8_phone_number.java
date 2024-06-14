import java.util.ArrayList;
import java.util.List;

public class B8_phone_number {
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // Initialize the result list with an empty string to start the combinations
        result.add("");
        
        // Iterate over each digit in the input string
        for (char digit : digits.toCharArray()) {
            // Get the corresponding letters for the current digit
            String letters = KEYPAD[digit - '0'];
            
            // Prepare a new list to store the combinations
            List<String> newResult = new ArrayList<>();
            
            // Iterate over the existing combinations and append each letter to them
            for (String combination : result) {
                for (char letter : letters.toCharArray()) {
                    newResult.add(combination + letter);
                }
            }
            
            // Update the result list with the new combinations
            result = newResult;
        }
        
        return result;
    }

    public static void main(String[] args) {
        B8_phone_number solution = new B8_phone_number();
        String digits = "23";
        List<String> combinations = solution.letterCombinations(digits);
        System.out.println(combinations);
    }
}

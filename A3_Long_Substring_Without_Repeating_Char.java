import java.util.HashMap;
import java.util.Map;

public class A3_Long_Substring_Without_Repeating_Char {

    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        
        
        for (int end = 0, start = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);   
           
            if (map.containsKey(currentChar)) {
                start = Math.max(start, map.get(currentChar) + 1);
            }
            
            map.put(currentChar, end);
            

            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        A3_Long_Substring_Without_Repeating_Char solution = new A3_Long_Substring_Without_Repeating_Char();
        String input = "abcabcbb";
        System.out.println("Length of the longest substring: " + solution.lengthOfLongestSubstring(input));  // Output: 3
    }
}

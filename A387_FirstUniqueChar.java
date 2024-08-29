import java.util.HashMap;
import java.util.Map;

public class A387_FirstUniqueChar {
    public int firstUniqChar(String s) {

        Map<Character, Integer> frequencyMap = new HashMap<>();
        

        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        

        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        A387_FirstUniqueChar solution = new A387_FirstUniqueChar();
        String s = "leetcode";
        System.out.println("The index of the first unique character is: " + solution.firstUniqChar(s));
    }
}

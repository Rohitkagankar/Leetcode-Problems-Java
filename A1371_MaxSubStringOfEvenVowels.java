import java.util.HashMap;

public class A1371_MaxSubStringOfEvenVowels {
    public int findTheLongestSubstring(String s) {
        // This map stores the first occurrence of each mask state
        HashMap<Integer, Integer> maskIndexMap = new HashMap<>();
        // Initialize with mask 0 at index -1 to handle full substring cases
        maskIndexMap.put(0, -1);
        
        int maxLength = 0;  // To store the maximum length of the substring
        int mask = 0;       // To store the current bitmask representing vowel parity

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Update the mask based on the vowel we encounter
            switch (ch) {
                case 'a':
                    mask ^= (1 << 0); // Toggle the 0th bit for 'a'
                    break;
                case 'e':
                    mask ^= (1 << 1); // Toggle the 1st bit for 'e'
                    break;
                case 'i':
                    mask ^= (1 << 2); // Toggle the 2nd bit for 'i'
                    break;
                case 'o':
                    mask ^= (1 << 3); // Toggle the 3rd bit for 'o'
                    break;
                case 'u':
                    mask ^= (1 << 4); // Toggle the 4th bit for 'u'
                    break;
                default:
                    break;
            }
            
            // If the current mask has been seen before, calculate the substring length
            if (maskIndexMap.containsKey(mask)) {
                maxLength = Math.max(maxLength, i - maskIndexMap.get(mask));
            } else {
                // If it's the first time we see this mask, record the index
                maskIndexMap.put(mask, i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        A1371_MaxSubStringOfEvenVowels solution = new A1371_MaxSubStringOfEvenVowels();
        String input = "eleetminicoworoep"; // Example input
        int result = solution.findTheLongestSubstring(input);
        String input1 = "aklfieadkss"; // Example input
        System.out.println("The length of the longest substring with vowels in even counts is: " + result);
        int result1 = solution.findTheLongestSubstring(input1);
        System.out.println("The length of the longest substring with vowels in even counts is: " + result1);
    }
}

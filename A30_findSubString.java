import java.util.*;

public class A30_findSubString {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;
        
        if (s.length() < totalLength) {
            return result;
        }

        // Create a frequency map for the words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Slide over the string with step size `wordLength`
        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int right = i;
            int count = 0;
            Map<String, Integer> seenWords = new HashMap<>();

            while (right + wordLength <= s.length()) {
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                if (wordMap.containsKey(word)) {
                    seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                    count++;

                    while (seenWords.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLength);
                        seenWords.put(leftWord, seenWords.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }

                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    seenWords.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        A30_findSubString solution = new A30_findSubString();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(solution.findSubstring(s, words)); // Output: [0, 9]

        s = "wordgoodgoodgoodbestword";
        words = new String[]{"word","good","best","good"};
        System.out.println(solution.findSubstring(s, words)); // Output: [8]

        s = "barfoofoobarthefoobarman";
        words = new String[]{"bar","foo","the"};
        System.out.println(solution.findSubstring(s, words)); // Output: [6, 9, 12]
    }
}
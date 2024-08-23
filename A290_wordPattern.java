import java.util.HashMap;

public class A290_wordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(word)) {
                    return false;
                }
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        A290_wordPattern wp = new A290_wordPattern();
        System.out.println(wp.wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(wp.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(wp.wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(wp.wordPattern("abba", "dog dog dog dog")); // false
    }
}

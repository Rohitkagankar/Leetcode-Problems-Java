import java.util.*;
public class A68_TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;
            
            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }

            StringBuilder builder = new StringBuilder();
            int diff = last - index - 1;
            
            if (last == words.length || diff == 0) {
                for (int i = index; i < last; i++) {
                    builder.append(words[i]).append(' ');
                }
                builder.deleteCharAt(builder.length() - 1);
                while (builder.length() < maxWidth) {
                    builder.append(' ');
                }
            } else {
                int spaces = (maxWidth - totalChars) / diff;
                int r = (maxWidth - totalChars) % diff;
                
                for (int i = index; i < last - 1; i++) {
                    builder.append(words[i]);
                    builder.append(' ');

                    for (int j = 0; j < spaces + (i - index < r ? 1 : 0); j++) {
                        builder.append(' ');
                    }
                }
                builder.append(words[last - 1]);
            }
            
            result.add(builder.toString());
            index = last;
        }
        
        return result;
    }
    public static void main(String[] args) {
        A68_TextJustification solution = new A68_TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> justifiedText = solution.fullJustify(words, maxWidth);
        
        for (String line : justifiedText) {
            System.out.println("\"" + line + "\"");
        }
    }
}

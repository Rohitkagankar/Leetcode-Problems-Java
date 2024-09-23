import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[s.length()];
    }

    public static void main(String[] args) {
        A139_WordBreak sol = new A139_WordBreak();
        List<String> wordDict = Arrays.asList("leet", "code");
        String s = "leetcode";

        boolean result = sol.wordBreak(s, wordDict);
        System.out.println(result);
    }
}

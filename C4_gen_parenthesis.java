import java.util.ArrayList;
import java.util.List;

public class C4_gen_parenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current string is a valid combination, add it to the result list
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // If we can add an open parenthesis, add it and recurse
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // If we can add a close parenthesis, add it and recurse
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
    public static void main(String[] args) {
        C4_gen_parenthesis solution = new C4_gen_parenthesis();
        List<String> parentheses = solution.generateParenthesis(3);
        for (String s : parentheses) {
            System.out.println(s);
        }
    }
}

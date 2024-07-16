import java.util.*;
public class J9_restoreIPadd {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, "", result);
        return result;
    }

    private void backtrack(String s, int start, int segment, String current, List<String> result) {

        if (segment == 4 && start == s.length()) {
            result.add(current);
            return;
        }
        if (segment == 4 || start == s.length()) {
            return;
        }

        for (int len = 1; len <= 3; len++) {

            if (start + len > s.length()) {
                break;
            }

            String part = s.substring(start, start + len);
            int value = Integer.parseInt(part);

            if (value > 255 || (part.length() > 1 && part.startsWith("0"))) {
                continue;
            }

            if (segment == 0) {
                backtrack(s, start + len, segment + 1, part, result);
            } else {
                backtrack(s, start + len, segment + 1, current + "." + part, result);
            }
        }
    }
    public static void main(String[] args) {
        J9_restoreIPadd sol=new J9_restoreIPadd();
        String s="25525511135";
        System.out.println(sol.restoreIpAddresses(s));

    }
}

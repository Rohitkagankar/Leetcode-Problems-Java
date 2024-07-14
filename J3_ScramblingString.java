import java.util.HashMap;
import java.util.Map;

public class J3_ScramblingString {
    private  Map<String,Boolean> memo=new HashMap<>();
    public boolean isScramble(String s1,String s2){
        
        if(s1.length() != s1.length()){
            return  false;
        }
        if(s1.equals(s2)){
            return true;
        }
        String key=s1+"-"+s2;
        if(memo.containsKey(key)){
            return  memo.get(key);
        }
        int n = s1.length();

        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        
        for (int i : count) {
            if (i != 0) {
                memo.put(key, false);
                return false;
            }
        }

        for (int i = 1; i < n; i++) {
            if ((isScramble(s1.substring(0, i), s2.substring(0, i)) && 
                 isScramble(s1.substring(i), s2.substring(i))) || 
                (isScramble(s1.substring(0, i), s2.substring(n - i)) && 
                 isScramble(s1.substring(i), s2.substring(0, n - i)))) {
                memo.put(key, true);
                return true;
            }
        }
        
        memo.put(key, false);
        return false;
    }
    public static void main(String[] args) {
        J3_ScramblingString sol=new J3_ScramblingString();
        String s1="abcde";
        String s2="caedb";
        System.out.println(sol.isScramble(s1,s2));
    }
}

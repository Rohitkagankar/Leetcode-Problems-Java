import java.util.Arrays;


public class A242_validAnagram {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char [] sArr= s.toCharArray();
        char [] tArr= t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
    public static void main(String[] args) {
        A242_validAnagram solution=new A242_validAnagram();
        
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Is \"" + s1 + "\" an anagram of \"" + t1 + "\"? " + solution.isAnagram(s1, t1));

    }
}

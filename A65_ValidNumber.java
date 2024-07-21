public class A65_ValidNumber {
    public boolean isValid(String s){
        if (s == null || s.length() == 0) {
            return false;
        }
        
        s = s.trim();
        
        boolean hasNum = false;
        boolean hasDot = false;
        boolean hasE = false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c >= '0' && c <= '9') {
                hasNum = true;
            } else if (c == '.') {
                if (hasDot || hasE) {
                    return false;
                }
                hasDot = true;
            } else if (c == 'e' || c == 'E') {
                if (hasE || !hasNum) {
                    return false;
                }
                hasE = true;
                hasNum = false;
            } else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
                hasNum = false;
            } else {
                return false;
            }
        }
        
        return hasNum;
    }
    public static void main(String[] args) {
        A65_ValidNumber sol=new A65_ValidNumber();
        String str=" -90e3   ";
        System.out.println(sol.isValid(str));
    }
}

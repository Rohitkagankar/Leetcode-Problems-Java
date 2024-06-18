import java.util.Stack;

public class D5_longestValidParenthesis {
    public static int validParenthesis(String str){
        Stack<Integer> s= new Stack<>();
        s.push(-1);
        int maxlength=0;
        for(int i=0; i<str.length(); i++){
            char curr=str.charAt(i);
            if(curr=='('){
                s.push(i);
            }else{
                s.pop();
                if(s.isEmpty()){
                    s.push(i);
                }else{
                    maxlength=Math.max(maxlength,i-s.peek());
                }
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        D5_longestValidParenthesis sol=new D5_longestValidParenthesis();
        String str="((((()))";
        System.out.println(sol.validParenthesis(str));
    }
}

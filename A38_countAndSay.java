public class A38_countAndSay {
    public String CountAndSay(int n){
        String result="1";
        for(int i=1; i<n; i++){
            result=nextCount(result);
        }
        return  result;
    }
    public static String nextCount(String sequence){
        StringBuilder nextSeq=new StringBuilder();
        char curr=sequence.charAt(0);
        int count=1;
        for(int i=1; i<sequence.length(); i++){
            if(sequence.charAt(i)==curr){
                count++;
            }else{
                nextSeq.append(count).append(curr);
                curr=sequence.charAt(i);
                count=1;
            }
        }
        nextSeq.append(count);
        nextSeq.append(curr);
        return nextSeq.toString();

    }
    public static void main(String[] args) {
        A38_countAndSay solution = new A38_countAndSay();
        int n = 4;
        System.out.println("The " + n + "th term in the 'Count and Say' sequence is: " + solution.CountAndSay(n));
    }
}

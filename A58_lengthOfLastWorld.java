public class A58_lengthOfLastWorld {
    public int wordlength (String s){
        s.trim();
        String [] words=s.split(" ");
        String lastword=words[words.length-1];
        return lastword.length();
    }
    public static void main(String[] args) {
        A58_lengthOfLastWorld sol=new A58_lengthOfLastWorld();
        String s="  hello Rohit ";
        System.out.println(sol.wordlength(s));
    }
}

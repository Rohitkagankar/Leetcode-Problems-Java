public class A59_lengthOfLastWorld {
    public int wordlength (String s){
        s.trim();
        String [] words=s.split(" ");
        String lastword=words[words.length-1];
        return lastword.length();
    }
    public static void main(String[] args) {
        A59_lengthOfLastWorld sol=new A59_lengthOfLastWorld();
        String s="  hello Rohit ";
        System.out.println(sol.wordlength(s));
    }
}

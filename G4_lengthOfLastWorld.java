public class G4_lengthOfLastWorld {
    public int wordlength (String s){
        s.trim();
        String [] words=s.split(" ");
        String lastword=words[words.length-1];
        return lastword.length();
    }
    public static void main(String[] args) {
        G4_lengthOfLastWorld sol=new G4_lengthOfLastWorld();
        String s="  hello Rohit ";
        System.out.println(sol.wordlength(s));
    }
}

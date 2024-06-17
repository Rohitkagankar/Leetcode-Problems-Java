public class D1_indexOf_first_Ocuu_In_Str {
    public static int indexOfOccurence(String haystack, String needle){
        if(needle.isEmpty()){
            return 0;
        }
        int haystackLength= haystack.length();
        int needleLength=needle.length();

        for(int i=0; i<=haystackLength-needleLength; i++){
            if(haystack.substring(i,i + needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack="ssadbutsad";
        String needle="sad";
        System.out.println(indexOfOccurence(haystack, needle));
    }
}

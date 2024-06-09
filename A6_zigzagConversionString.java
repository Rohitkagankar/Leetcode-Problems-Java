public class A6_zigzagConversionString {
    public String zigzagConv(String s,int numRows){
        String [] ans=new String[numRows];
        for(int i=0; i<numRows; i++){
            ans[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int index=0; index<numRows && i<s.length(); i++){
                ans[index]+=s.charAt(i++);
            }
            for(int index=numRows-2; index>0 && i<s.length(); i--){
                ans[index]+=s.charAt(i++);
            }
        }
        String res="";
        for(String str: ans){
            res+=str;
        }
        return res;
    }

    public static void main(String[] args) {
        A6_zigzagConversionString solution = new A6_zigzagConversionString();
        String input = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println("Converted string: " + solution.zigzagConv(input, numRows));
    }
}

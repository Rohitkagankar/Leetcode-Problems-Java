public class A67_addBinary {
    public String addBinary(String a,String b){
        StringBuilder result=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        
        int carry=0;
        while(i>=0 && j>=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i--)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j--)-'0';
            }
            result.append(sum%2);
            carry=sum/2;
        }
        if(carry != 0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        A67_addBinary sol=new A67_addBinary();
        String a="11";
        String b="001";
        System.out.println(sol.addBinary(a,b));
    }
}

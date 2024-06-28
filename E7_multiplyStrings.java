public class E7_multiplyStrings {
    public static String multiplyStrings(String num1,String num2){
        int m=num1.length();
        int n=num2.length();
        int [] result=new int[m+n];

        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p1=i+j, p2=i+j+1;
                int sum=mul+result[p2];

                result[p1]+=sum/10;
                result[p2]=sum%10;
            }
        }
        StringBuilder finalResult=new StringBuilder();
        for(int num:result) if(!(finalResult.length()==0 && num==0)) finalResult.append(num);
        return finalResult.length()==0 ? "0": finalResult.toString();
    }
    public static void main(String[] args) {
        String num1="123";
        String num2="456";
        System.out.println(multiplyStrings(num1,num2));
    }
}

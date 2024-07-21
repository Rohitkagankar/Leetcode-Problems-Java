import java.util.*;

public class A60_PermutationSequence {
    public String getPermutation(int n,int k){
        List<Integer> numbers=new ArrayList<>();
        int [] factorial=new int[n+1];
        StringBuilder sb= new StringBuilder();

        int fact=1;
        factorial[0]=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
            factorial[i]=fact;
            numbers.add(i);
        }
        k--;

        for(int i=1; i<=n; i++){
            int index=k/factorial[n-i];
            sb.append(numbers.get(index));
            numbers.remove(index);
            k-=index*factorial[n-i];
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        A60_PermutationSequence sol=new A60_PermutationSequence();
        int n=4,k=9;
        System.out.println(sol.getPermutation(n,k));
    }
}

import java.util.ArrayList;
import java.util.List;

public class A89_GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }
    public static void main(String[] args) {
        A89_GrayCode gc = new A89_GrayCode();
        int n = 3; 
        List<Integer> grayCodeSequence = gc.grayCode(n);
        System.out.println(grayCodeSequence);
    }
}

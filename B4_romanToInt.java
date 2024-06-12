import java.util.HashMap;
import java.util.Map;

public class B4_romanToInt {
    public static int romtoInt(String s){
        Map<Character,Integer>  values = new HashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);

        int total=0;
        int prev=0;

        for(int i=s.length()-1; i>=0; i-- ){
            char currchar=s.charAt(i);
            int currVal=values.get(currchar);

            if(currVal<prev){
                total-=currVal;
            }else{
                total+=currVal;
            }
            prev=currVal;
        }
        return total;
  
    }
    public static void main(String[] args) {
        System.out.println(romtoInt("III"));
        System.out.println(romtoInt("IV"));
        System.out.println(romtoInt("IX"));
        System.out.println(romtoInt("LVIII"));
        
    }
}

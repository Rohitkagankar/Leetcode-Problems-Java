import java.util.*;
public class A49_GroupAnagram {
    public List<List<String>> groupAnagram(String [] strs){
        if(strs==null || strs.length==0) return new ArrayList<>();
        Map <String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char [] ca=s.toCharArray();
            Arrays.sort(ca);
            String key=String.valueOf(ca);
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        A49_GroupAnagram sol=new A49_GroupAnagram();
        String [] strs={"eat","tea","mat","atm","cat","bat"};
        List<List<String>> result= sol.groupAnagram(strs);
        for(List<String> s : result){
            System.out.println(s);
        }
    }
}

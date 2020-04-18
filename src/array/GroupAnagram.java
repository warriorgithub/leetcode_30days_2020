package array;
import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result =  new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char c[] = str.toCharArray();
            Arrays.sort(c);
            String st = new String(c);
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(str);
        }	result.addAll(map.values());
        return result;
    }
}

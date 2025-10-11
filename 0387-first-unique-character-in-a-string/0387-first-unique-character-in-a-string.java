import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),-1);
            }
            else{
                map.put(s.charAt(i), i);
            }
        }

        int min = Integer.MAX_VALUE;
        for(Character m: map.keySet()){
            if(map.get(m) != -1 && map.get(m) < min){
                min = map.get(m);
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
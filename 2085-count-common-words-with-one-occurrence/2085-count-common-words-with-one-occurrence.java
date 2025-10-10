import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int counter = 0;

        for(String word : words1){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word, 1);
            }
        }
        for(String word : words2){
            if(map2.containsKey(word)){
                map2.put(word, map2.get(word)+1);
            }
            else{
                map2.put(word, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1 && map2.getOrDefault(entry.getKey(), 0) == 1){
                counter++;
            }
        }
    return counter;
    }
}
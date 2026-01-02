import java.util.*;

class Solution {
    public int minDeletion(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Integer> freqs = new ArrayList<>(map.values());
        Collections.sort(freqs);
        
        int sum = 0;
        int list_len = freqs.size();
        
        for (int freq : freqs) {
            if (list_len <= k) break;
            sum += freq;
            list_len--;
        }
        return sum;
    }
}
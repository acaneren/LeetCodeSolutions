class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int freq : map.values()) {
            while (freq > 0 && set.contains(freq)) {
                freq--;
                count++;
            }
            set.add(freq);
        }
        return count;
    }
}

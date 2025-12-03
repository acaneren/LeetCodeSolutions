class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }
            else {
                map.put(c, map.get(c) + 1);
            }
        }
        String vowels = "aeiou";
        int max = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (vowels.indexOf(e.getKey()) != -1 && e.getValue() > max) {
                max = e.getValue();
            }
        }
        int sum = max;
        max = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (vowels.indexOf(e.getKey()) == -1 && e.getValue() > max) {
                max = e.getValue();
            }
        }
        return sum + max;
    }
}
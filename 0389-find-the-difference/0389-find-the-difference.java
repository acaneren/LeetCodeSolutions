class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(Character c : t.toCharArray()){
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }

        for(Character c : s.toCharArray()){
            map.put(c, map.get(c) - 1);
        }

        for(Character key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return ' ';
    }
}
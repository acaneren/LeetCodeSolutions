class Solution {
    public long minCost(String s, int[] cost) {
        Map<Character, Long> map = new HashMap<>();
        long total = 0;

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(s.charAt(i))){
                map.put(c, (long) cost[i]);
            }
            else{
                map.put(c, map.get(c) + cost[i]);
            }
            total += cost[i];
        }

        long max = 0;
        for(long val : map.values()){
            if(val > max){
                max = val;
            }
        }
        return total - max;
    }
}
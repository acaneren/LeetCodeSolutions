import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=1; i < nums.length; i++){
            if(nums[i-1] == key){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i], 1);
                }
                else{
                    map.put(nums[i], map.get(nums[i]) + 1);
                }
            }
        }
        int num = 0;
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > count){
                num = entry.getKey();
                count = entry.getValue();
            }
        }
        return num;
    }
}
import java.util.HashMap;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                arr[0] = nums[i-1];
                arr[1] = nums[i]+1;
                return arr;
            }
        }
        return arr;
    }
}
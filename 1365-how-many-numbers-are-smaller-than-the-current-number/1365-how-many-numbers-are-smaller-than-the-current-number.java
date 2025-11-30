class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }
            else{
                map.put(num, map.get(num) + 1);
            }
        }
        int counter = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int sum = e.getValue();
            map.put(e.getKey(), counter);
            counter += sum;
        }
        for(int i=0; i < nums.length; i++){
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
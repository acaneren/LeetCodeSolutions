class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int min = nums[0];
        int max = nums[0];

        for(int num:nums){
            if(num < min) min = num;
            if(num > max) max = num;
        }

        List<Integer> missing_values = new ArrayList<>();
        for(int i=min+1; i < max; i++){
            if(!set.contains(i)){
                missing_values.add(i);
            }
        }
        return missing_values;
    }
}
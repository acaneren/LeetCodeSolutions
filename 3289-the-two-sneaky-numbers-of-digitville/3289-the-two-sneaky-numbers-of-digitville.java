class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map1 = new HashMap<>();
        ArrayList<Integer> list1 = new ArrayList<>();


        for(int num: nums){
            if(map1.containsKey(num)){
                map1.put(num, map1.get(num) + 1);
                if ((map1.get(num)) == 2){
                    list1.add(num);
                    if (list1.size() == 2){
                        int[] arr = new int[2];
                        arr[0] = list1.get(0);
                        arr[1] = list1.get(1);
                        return arr;
                    }
                }
            }
            else{
                map1.put(num, 1);
            }
        }
        return null;
    }
}
class Solution {
    public int[] sortByReflection(int[] nums) {

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int num : nums) {

            String binaryStr = Integer.toBinaryString(num);
            String reversed = new StringBuilder(binaryStr).reverse().toString();
            int reversed_binary = Integer.parseInt(reversed, 2);

            map.computeIfAbsent(reversed_binary, k -> new ArrayList<>()).add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (List<Integer> list : map.values()) {
            Collections.sort(list);
            result.addAll(list);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}

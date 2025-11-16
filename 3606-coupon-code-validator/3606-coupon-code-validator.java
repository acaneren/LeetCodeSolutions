class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        HashMap<String, List<String>> map = new HashMap<>();

        map.put("electronics", new ArrayList<>());
        map.put("grocery", new ArrayList<>());
        map.put("pharmacy", new ArrayList<>());
        map.put("restaurant", new ArrayList<>());

        for (int i = 0; i < code.length; i++) {
            if (map.containsKey(businessLine[i]) && isActive[i] && code[i].matches("[a-zA-Z0-9_]+")) {
                map.get(businessLine[i]).add(code[i]);
            }
        }
        for (String key : map.keySet()) {
            Collections.sort(map.get(key));
        }

        List<String> result = new ArrayList<>();
        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};

        for (String key : order) {
            result.addAll(map.get(key));
        }
        return result;
    }
}
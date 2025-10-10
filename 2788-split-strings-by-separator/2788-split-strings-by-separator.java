class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        
        for (String word : words) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == separator) {
                    if(sb.length() > 0){
                        list.add(sb.toString());
                        sb.setLength(0);
                    }
                }
                else{
                    sb.append(word.charAt(j));
                }
            }
            if(sb.length() > 0) {
                list.add(sb.toString());
            }
        }
        return list;
    }
}
class Solution {
    public String generateTag(String caption) {
        if (caption == null || caption.trim().isEmpty()) {
            return "#";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('#');
        if (caption.charAt(0) != ' ') {
            sb.append(Character.toLowerCase(caption.charAt(0)));
        }

        boolean firstRealCharAdded = (caption.charAt(0) != ' ');
        for (int i = 1; i < caption.length(); i++) {
            if (caption.charAt(i) == ' ') {
                continue;
            }

            if (!firstRealCharAdded) {
                sb.append(Character.toLowerCase(caption.charAt(i)));
                firstRealCharAdded = true;
            } else if (caption.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(caption.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(caption.charAt(i)));
            }
        }
        return sb.substring(0, Math.min(100, sb.length()));
    }
}
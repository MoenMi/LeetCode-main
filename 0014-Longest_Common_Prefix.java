class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int shortest = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < shortest) shortest = str.length();
        }
        char cur;
        for (int i = 0; i < shortest; i++) {
            cur = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (cur != strs[j].charAt(i)) return prefix;
            }
            prefix += cur;
        }
        return prefix;
    }
}

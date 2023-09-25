class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        int cur;
        boolean midWord;
        
        for (String str : sentences) {
            cur = 0;
            midWord = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ' && !midWord) {
                    cur++;
                    midWord = true;
                } else if (str.charAt(i) == ' ') {
                    midWord = false;
                }
            }
            if (cur > max) max = cur;
        }
        
        return max;        
    }
}

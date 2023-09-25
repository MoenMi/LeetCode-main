class Solution {
    public String restoreString(String s, int[] indices) {
        String ns = "";
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices.length; j++) {
                if (i == indices[j]) {
                    ns += s.charAt(j);
                    break;
                }
            }
        }
        return ns;
    }
}

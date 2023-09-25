class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean letterCheck;
        for (int i = 0; i < ransomNote.length(); i++) {
            letterCheck = false;
            for (int j = 0; j < magazine.length(); j++) {
                if (ransomNote.charAt(i) == magazine.charAt(j)) {
                    if (j == 0) {
                        magazine = magazine.substring(1);
                        letterCheck = true;
                        break;
                    }
                    if (magazine.length()-1 == j) {
                        magazine = magazine.substring(0, j);
                        letterCheck = true;
                        break;
                    }
                    magazine = magazine.substring(0, j) + magazine.substring(j+1);
                    letterCheck = true;
                    break;
                }
            }
            if (!letterCheck) return false;
        }
        return true;
    }
}

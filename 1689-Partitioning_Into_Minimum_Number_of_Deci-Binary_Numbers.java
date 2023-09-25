class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            if (max < 1 && n.charAt(i) == '1') max = 1;
            if (max < 2 && n.charAt(i) == '2') max = 2;
            if (max < 3 && n.charAt(i) == '3') max = 3;
            if (max < 4 && n.charAt(i) == '4') max = 4;
            if (max < 5 && n.charAt(i) == '5') max = 5;
            if (max < 6 && n.charAt(i) == '6') max = 6;
            if (max < 7 && n.charAt(i) == '7') max = 7;
            if (max < 8 && n.charAt(i) == '8') max = 8;
            if (max < 9 && n.charAt(i) == '9') return 9;
        }
        return max;
    }
}

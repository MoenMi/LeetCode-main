class Solution {
    public int getSum(int a, int b) {
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                a++;
            }
        }
        if (b < 0) {
            b *= -1;
            for (int i = 0; i < b; i++) {
                a--;
            }
        }
        return a;
    }
}

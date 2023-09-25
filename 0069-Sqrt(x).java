class Solution {
    public int mySqrt(int x) {
        if (x == 1) return 1;
        long sq = x;
        long sqroot = 0;
        for (long i = 0; i <= sq; i++) {
            if (i*i > sq) {
                sqroot = i-1;
                break;
            }
        }
        if (sqroot < 0) sqroot = 0;
        return (int)sqroot;
    }
}

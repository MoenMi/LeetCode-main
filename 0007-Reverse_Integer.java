class Solution {
    public int reverse(int x) {
        int num = 0;
        int factor = -1;
        boolean neg = x < 0;
        x = Math.abs(x);
        int xCopy = x;
        while (xCopy > 0) {
            xCopy /= 10;
            factor++;
        }
        while (x > 0) {
            num += (x%10) * Math.pow(10, factor--);
            x /= 10;
        }
        if (neg) num *= -1;
        if (num >= 2147483647 || num <= -2147483647) return 0;
        return num;
    }
}

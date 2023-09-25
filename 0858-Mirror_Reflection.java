class Solution {
    public int mirrorReflection(int p, int q) {
        boolean left = true;
        int vert = 0;
        while (true) {
            left = !left;
            vert += q;
            if (vert % p == 0) {
                if ((vert/p) % 2 == 1) {
                    if (left) 
                        return 2;
                    else
                        return 1;
                } else {
                    if (!left) return 0;
                }
            }
        }
    }
}

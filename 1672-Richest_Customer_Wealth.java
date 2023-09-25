class Solution {
    public int maximumWealth(int[][] accounts) {
        int mostWealth = 0;
        int curWealth;
        for (int i = 0; i < accounts.length; i++) {
            curWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curWealth += accounts[i][j];
            }
            if (curWealth > mostWealth) mostWealth = curWealth;
        }
        return mostWealth;
    }
}

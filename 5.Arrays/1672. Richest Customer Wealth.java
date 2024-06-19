
class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        int max=0;
        for (int i = 0; i < accounts.length; i++) {
            
            for (int j = 0; j < accounts[i].length; j++) {
                wealth = wealth+accounts[i][j];
            }
            if (max<=wealth) {
                max=wealth;
            }
            wealth=0;
        }
        

        return max;
    }
}
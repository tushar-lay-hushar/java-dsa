import java.util.ArrayList;
import java.util.Arrays;

public class CoinPlay {

    public static void main(String[] args) {

        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(new Integer[]{8,15,3,7}));

        System.out.println(max_win(s));

    }

    static Integer max_win(ArrayList<Integer> v) {

        int[][] dp = new int[v.size()][v.size()];

        for(int numCoins = 1; numCoins <= v.size(); numCoins++){
            for(int i=0; i<=v.size()-numCoins; i++){
                int j = i+numCoins-1;
                if(numCoins == 1){
                    dp[i][j] = v.get(i);
                }
                else if(numCoins == 2){
                    dp[i][j] = Math.max(v.get(i), v.get(j));
                }
                else{
                    dp[i][j] = Math.max(v.get(i) + Math.min(dp[i+2][j], dp[i+1][j-1]),
                            v.get(j) + Math.min(dp[i+1][j-1], dp[i][j-2]));
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j =0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[0][v.size()-1];
    }
}

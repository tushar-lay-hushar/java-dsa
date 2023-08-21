import java.util.ArrayList;
import java.util.Arrays;

public class CutTheRod {

    public static void main(String[] args) {
        ArrayList<Integer> price = new ArrayList<>(Arrays.asList(new Integer[]{1,5,8,9}));
        System.out.println(getMaxProfit(price));
    }

    static Integer getMaxProfit(ArrayList<Integer> price) {
        int[] memo = new int[price.size() + 1];

        for(int i = 0; i <= price.size(); i++) {
            memo[i] = -1;
        }

        return maxProfit(price, price.size(), memo);
    }

    static Integer maxProfit(ArrayList<Integer> price, int len, int[] memo) {
        if (len <= 0) {
            return 0;
        }

        if (memo[len] != -1) {
            return memo[len];
        }

        for (int c = 1; c <= len; c++) {
            memo[len] = Math.max(memo[len], maxProfit(price, len - c, memo) + price.get(c - 1));
        }

        return memo[len];
    }
}

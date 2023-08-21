import java.util.ArrayList;
import java.util.Arrays;

public class EqualSubset {

    public static void main(String[] args) {

        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,6}));

        System.out.println(equal_subset_sum_partition(s));

    }

    static boolean equal_subset_sum_partition(ArrayList<Integer> s) {
        // Write your code here.
        int total = 0;

        for(int num : s) {
            total += num;
        }

        if(total % 2 == 1) {
            return false;
        }

        int range = total / 2;
        boolean[][] table = new boolean[s.size() + 1][range + 1];

        for(int i = 0; i <= s.size(); i++) {
            table[i][0] = true;
        }

        for(int i = 1; i <= range; i++) {
            table[s.size()][i] = false;
        }

        for(int i = s.size() - 1 ; i >= 0; i--) {
            for(int sum = 1; sum <= range; sum++) {
                boolean result = false;
                if(sum >= s.get(i)) {
                    result = table[i + 1][sum - s.get(i)];
                }
                table[i][sum] = result || table[i + 1][sum];
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j =0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        return table[0][range];
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class LargestIsland {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,0)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,0)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,1)));

        System.out.println(max_island_size(matrix));
    }

    static Integer max_island_size(ArrayList<ArrayList<Integer>> grid) {
        // Write your code here.
        int result = 0;
        for(int i = 0; i < grid.size(); i++) {
            for(int j = 0; j < grid.get(0).size(); j++) {
                result = Integer.max(result, dfs(grid, i, j));
            }
        }
        return result;
    }

    static int dfs(ArrayList<ArrayList<Integer>> grid, int r, int c) {
        if(r < 0 || r >= grid.size() || c < 0 || c >= grid.get(0).size() || grid.get(r).get(c) == 0) {
            return 0;
        }

        int temp = 1;
        grid.get(r).set(c, 0);
        temp += dfs(grid, r + 1, c);
        temp += dfs(grid, r, c + 1);
        temp += dfs(grid, r - 1, c);
        temp += dfs(grid, r, c - 1);

        return temp;
    }
}

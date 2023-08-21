import java.util.ArrayList;
import java.util.Arrays;

public class CountIslands {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,0,0,0)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,0,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,0,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,0,0,0)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1,0,1)));

        System.out.println(count_islands(matrix));
    }

    static Integer count_islands(ArrayList<ArrayList<Integer>> matrix) {
        // Write your code here.
        int islands = 0;

        for(int i = 0; i < matrix.size(); i++) {
            for(int j = 0; j < matrix.get(0).size(); j++) {
                if(matrix.get(i).get(j) == 1) {
                    islands++;
                    dfs(matrix, i, j);
                }
            }
        }

        return islands;
    }

    /*static void dfs(ArrayList<ArrayList<Integer>> matrix, int r, int c) {
        int rCount = matrix.size();
        int cCount = matrix.get(0).size();
        matrix.get(r).set(c, 0);

        if(r + 1 < rCount && matrix.get(r + 1).get(c) == 1) {
            dfs(matrix, r + 1, c);
        }

        if(c + 1 < cCount && matrix.get(r).get(c + 1) == 1) {
            dfs(matrix, r, c + 1);
        }

        if(r - 1 >= 0 && matrix.get(r - 1).get(c) == 1) {
            dfs(matrix, r - 1, c);
        }

        if(c - 1 >= 0 && matrix.get(r).get(c - 1) == 1) {
            dfs(matrix, r, c - 1);
        }

        if(r + 1 < rCount && c + 1 < cCount && matrix.get(r + 1).get(c + 1) == 1) {
            dfs(matrix, r + 1, c + 1);
        }

        if(r - 1 >= 0 && c - 1 >= 0 && matrix.get(r - 1).get(c - 1) == 1) {
            dfs(matrix, r - 1, c - 1);
        }

        if(r + 1 < rCount && c - 1 >= 0 && matrix.get(r + 1).get(c - 1) == 1) {
            dfs(matrix, r + 1, c - 1);
        }

        if(r - 1 >= 0 && c + 1 < cCount && matrix.get(r - 1).get(c + 1) == 1) {
            dfs(matrix, r - 1, c + 1);
        }
    }*/

    static void dfs(ArrayList<ArrayList<Integer>> grid, int r, int c) {
        if(r < 0 || r >= grid.size() || c < 0 || c >= grid.get(0).size() || grid.get(r).get(c) == 0) {
            return;
        }

        grid.get(r).set(c, 0);

        dfs(grid, r + 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r + 1, c + 1);
        dfs(grid, r - 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r - 1, c - 1);
    }
}

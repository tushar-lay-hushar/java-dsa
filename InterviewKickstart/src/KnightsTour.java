import java.util.LinkedList;
import java.util.Queue;

public class KnightsTour {

    public static void main(String[] args) {
        System.out.println(find_minimum_number_of_moves(5,5,0,0,4,1));
    }

    static Integer find_minimum_number_of_moves(Integer rows, Integer cols, Integer start_row, Integer start_col, Integer end_row, Integer end_col) {
        // Write your code here.
        if(start_row.equals(end_row) && start_col.equals(end_col)) {
            return 0;
        }

        int[][] moves = new int[][]{{1,2},{-1,2},{1,-2},{-1,-2},{2,1},{-2,1},{2,-1},{-2,-1}};
        boolean[][] visited = new boolean[rows][cols];

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start_row, start_col});

        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] node = q.poll();
                if (node[0] == end_row && node[1] == end_col) {
                    return steps;
                }
                for (int[] move : moves) {
                    int newRow = node[0] + move[0];
                    int newCol = node[1] + move[1];
                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !visited[newRow][newCol]) {
                        q.offer(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                    }
                }
            }
            steps++;

        }

        return steps;
    }


}

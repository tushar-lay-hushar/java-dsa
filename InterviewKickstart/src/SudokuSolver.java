import java.util.ArrayList;
import java.util.Arrays;

/*

input:
[8, 4, 9, 0, 0, 3, 5, 7, 0],
[0, 1, 0, 0, 0, 0, 0, 0, 0],
[7, 0, 0, 0, 9, 0, 0, 8, 3],
[0, 0, 0, 9, 4, 6, 7, 0, 0],
[0, 8, 0, 0, 5, 0, 0, 4, 0],
[0, 0, 6, 8, 7, 2, 0, 0, 0],
[5, 7, 0, 0, 1, 0, 0, 0, 4],
[0, 0, 0, 0, 0, 0, 0, 1, 0],
[0, 2, 1, 7, 0, 0, 8, 6, 5]

output:
[8, 4, 9, 1, 6, 3, 5, 7, 2],
[3, 1, 5, 2, 8, 7, 4, 9, 6],
[7, 6, 2, 4, 9, 5, 1, 8, 3],
[1, 5, 3, 9, 4, 6, 7, 2, 8],
[2, 8, 7, 3, 5, 1, 6, 4, 9],
[4, 9, 6, 8, 7, 2, 3, 5, 1],
[5, 7, 8, 6, 1, 9, 2, 3, 4],
[6, 3, 4, 5, 2, 8, 9, 1, 7],
[9, 2, 1, 7, 3, 4, 8, 6, 5]

 */
public class SudokuSolver {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> sudoku = new ArrayList<>();
        sudoku.add(new ArrayList<>(Arrays.asList(8, 4, 9, 0, 0, 3, 5, 7, 0)));
        sudoku.add(new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0, 0, 0, 0, 0)));
        sudoku.add(new ArrayList<>(Arrays.asList(7, 0, 0, 0, 9, 0, 0, 8, 3)));
        sudoku.add(new ArrayList<>(Arrays.asList(0, 0, 0, 9, 4, 6, 7, 0, 0)));
        sudoku.add(new ArrayList<>(Arrays.asList(0, 8, 0, 0, 5, 0, 0, 4, 0)));
        sudoku.add(new ArrayList<>(Arrays.asList(0, 0, 6, 8, 7, 2, 0, 0, 0)));
        sudoku.add(new ArrayList<>(Arrays.asList(5, 7, 0, 0, 1, 0, 0, 0, 4)));
        sudoku.add(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 1, 0)));
        sudoku.add(new ArrayList<>(Arrays.asList(0, 2, 1, 7, 0, 0, 8, 6, 5)));

        sudoku.stream().forEach(System.out::println);
        System.out.println();

        solve(sudoku, 0, 0);

        sudoku.stream().forEach(System.out::println);

    }

    private static boolean solve(ArrayList<ArrayList<Integer>> sudoku, int row, int column) {
        if (row == 9) {
            return true;
        }
        if (column == 9) {
            return solve(sudoku, row + 1, 0);
        }

        if (sudoku.get(row).get(column) != 0) {
            return solve(sudoku, row, column + 1);
        }

        for (int i = 1; i <= 9; i++) {
            if(check(sudoku, i, row, column)) {
                sudoku.get(row).set(column, i);
                if (solve(sudoku, row, column + 1)) {
                    return true;
                }
                sudoku.get(row).set(column, 0);
            }
        }
        return false;
    }

    private static boolean check(ArrayList<ArrayList<Integer>> sudoku, int num, int row, int column) {
        for (int i = 0; i < 9; i++) {
            if (sudoku.get(i).get(column) == num) {
                return false;
            }
            if (sudoku.get(row).get(i) == num) {
                return false;
            }
        }
        int r = (row / 3) * 3;
        int c = (column / 3) * 3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (sudoku.get(i).get(j) == num) {
                    return false;
                }
            }
        }
        return true;
    }

}

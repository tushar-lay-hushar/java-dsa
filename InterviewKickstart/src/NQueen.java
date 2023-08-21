import java.util.ArrayList;
import java.util.Arrays;

public class NQueen {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        nQueen(3, new ArrayList<>(), result);

        result.stream().forEach(list -> list.stream().forEach(System.out::println));

    }

    private static void nQueen(int n, ArrayList<String> sol, ArrayList<ArrayList<String>> result) {
        if (sol.size() == n) {
            result.add(new ArrayList<>(sol));
            return;
        }

        char[] arr = new char[n];
        Arrays.fill(arr, '-');
        String slate = new String(arr);

        for (int i = 0; i < n; i++) {
            if(check(sol, i)) {
                sol.add(slate.substring(0, i) + 'q' + slate.substring(i + 1));
                nQueen(n, sol, result);
                sol.remove(sol.size() - 1);
            }
        }
    }

    private static boolean check(ArrayList<String> sol, int pos) {
        if (sol.isEmpty()) {
            return true;
        }

        int leftDiag = pos - 1;
        int rightDiag = pos + 1;
        for (int i = sol.size() - 1; i >= 0; i--) {
            String s = sol.get(i);
            if (s.charAt(pos) == 'q') {
                return false;
            }
            if ((leftDiag >= 0 && s.charAt(leftDiag) == 'q') || (rightDiag < s.length() && s.charAt(rightDiag) == 'q')) {
                return false;
            }
            leftDiag--;
            rightDiag++;
        }
        return true;
    }
}

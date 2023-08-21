import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {

    public static void main(String[] args) {

//        System.out.println(minimum_number_of_rolls(20, ));
    }

    static Integer minimum_number_of_rolls(Integer n, ArrayList<Integer> moves) {
        // Write your code here.
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        int steps = 0;

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int indice = q.poll();
                if(indice == n - 1) {
                    return steps;
                }
                for(int j = 1; j < 7; j++) {
                    int newIndice = indice + j;
                    if(newIndice < n) {
                        if(moves.get(newIndice) != -1) {
                            newIndice = moves.get(newIndice);
                        }
                        if(!visited[newIndice]) {
                            visited[newIndice] = true;
                            q.offer(newIndice);
                        }
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}

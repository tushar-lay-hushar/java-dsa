import java.util.ArrayList;
import java.util.Arrays;

public class LogestPathDAG {

    public static void main(String[] args) {
        ArrayList<Integer> dag_from = new ArrayList<>(Arrays.asList(new Integer[]{1,1,1,3}));
        ArrayList<Integer> dag_to = new ArrayList<>(Arrays.asList(new Integer[]{2,3,4,4}));
        ArrayList<Integer> dag_weight = new ArrayList<>(Arrays.asList(new Integer[]{2,2,4,3}));

        System.out.println(find_longest_path(4, dag_from, dag_to, dag_weight, 1, 4));
    }


    static ArrayList<Integer> find_longest_path(Integer dag_nodes, ArrayList<Integer> dag_from, ArrayList<Integer> dag_to, ArrayList<Integer> dag_weight, Integer from_node, Integer to_node) {
        // Write your code here.
        return new ArrayList();
    }

}

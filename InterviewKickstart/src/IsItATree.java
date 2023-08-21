import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsItATree {

    public static void main(String[] args) {
        System.out.println(is_it_a_tree(4, new ArrayList<>(Arrays.asList(0,0,1,2)), new ArrayList<>(Arrays.asList(3,1,2,0))));
    }

    static Boolean is_it_a_tree(Integer node_count, ArrayList<Integer> edge_start, ArrayList<Integer> edge_end) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[node_count];
        int[] parent = new int[node_count];
        Queue<Integer> q = new LinkedList<>();
        int component = 0;

        for(int i = 0; i < node_count; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < node_count; i++) {
            parent[i] = -1;
        }


        for(int i = 0; i < edge_start.size(); i++) {
            adj.get(edge_start.get(i)).add(edge_end.get(i));
            adj.get(edge_end.get(i)).add(edge_start.get(i));
        }

        for(int i = 0; i < node_count; i++) {
            if(!visited[i]) {
                if(component > 0) {
                    return false;
                }
                component++;
                visited[i] = true;
                q.offer(i);
                while(!q.isEmpty()) {
                    int node = q.poll();
                    ArrayList<Integer> children = adj.get(node);
                    for(int child : children) {
                        if(visited[child]) {
                            if(parent[node] != child) {
                                return false;
                            }
                        }
                        else {
                            visited[child] = true;
                            parent[child] = node;
                            q.offer(child);
                        }
                    }
                }

            }
        }
        return true;
    }
}

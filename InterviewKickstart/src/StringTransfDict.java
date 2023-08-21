import java.util.*;

public class StringTransfDict {

    public static void main(String[] args) {

    }



    static ArrayList<String> string_transformation(ArrayList<String> words, String start, String stop) {
        Set<String> dict = new HashSet<>();
        for (String w: words) {
            dict.add(w);
        }
        dict.add(stop);
        ArrayList<String> res = new ArrayList<>();

        Map<String, String> bwd1 = new HashMap<>();
        Map<String, String> bwd2 = new HashMap<>();

        Queue<String> p = new LinkedList<>();
        Queue<String> q = new LinkedList<>();

        p.add(start);
        q.add(stop);
        boolean found = false;
        int step = 0;
        String tgt = "";
        while(p.size() > 0 || q.size() > 0) {
            step++;
            int n = p.size();
            for (int t = 0; t < n; t++) { // 1 layer in BFS
                String w1 = p.remove();
                List<String> y = gen(w1, dict);
                if (y.size() == 0) continue;
                for (String w2: y) {
                    if (w2.equals(stop)) {
                        if (step == 1) {
                            res.add(start);
                            res.add(stop);
                            return res;
                        }
                        tgt = w2;
                        bwd1.put(w2, w1);
                        found = true;
                        break;
                    }
                    if (bwd2.containsKey(w2)) {
                        tgt = w2;
                        found = true;
                        bwd1.put(w2, w1);
                        break;
                    }
                    if (bwd1.containsKey(w2)) continue;
                    bwd1.put(w2, w1);
                    p.add(w2);
                }
                if (found) break;
            }
            if (found) break;
            n = q.size();
            for (int t = 0; t < n; t++) { // 1 layer in BFS
                String w1 = q.remove();
                List<String> y = gen(w1, dict);
                if (y.size() == 0) continue;
                for (String w2: y) {
                    if (bwd1.containsKey(w2)) {
                        tgt = w2;
                        found = true;
                        bwd2.put(w2, w1);
                        break;
                    }
                    if (bwd2.containsKey(w2)) continue;
                    bwd2.put(w2, w1);
                    q.add(w2);
                }
                if (found) break;
            }
            if (found) break;
        }
        if (found) {
            String c = tgt;
            res.add(c);
            c = bwd1.get(c);
            while (!c.equals(start)) {
                res.add(c);
                c = bwd1.get(c);
            }
            res.add(start);
            Collections.reverse(res);
            if (tgt.equals(stop)) {
                return res;
            }
            c = tgt;
            do {
                c = bwd2.get(c);
                res.add(c);
            } while(!c.equals(stop));
            return res;
        }

        res.add("-1");
        return res;
    }

    static List<String> gen(String w, Set<String> dict) {
        List<String> res = new ArrayList<>();
        if (w.length() > 26) {
            for (String w2: dict) {
                if (diff_by_1(w, w2)) {
                    res.add(w2);
                }
            }
            return res;
        }
        StringBuilder sb = new StringBuilder(w);
        for (int k = 0; k < w.length(); k++) {
            char x = sb.charAt(k);
            for (int j = 0; j < 26; j++) {
                char y = (char)('a' + j);
                if (y == x) continue;
                sb.setCharAt(k, y);
                String w2 = sb.toString();
                if (dict.contains(w2)) {
                    res.add(w2);
                }
            }
            sb.setCharAt(k, x);
        }
        return res;
    }
    static boolean diff_by_1(String w1, String w2) {
        int c = 0;
        for (int k = 0; k < w1.length(); k++) {
            if (w1.charAt(k) != w2.charAt(k)) c++;
            if (c == 2) return false;
        }
        return (c == 1);
    }

}

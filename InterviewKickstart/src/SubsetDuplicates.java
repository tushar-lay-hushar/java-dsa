import java.util.*;

public class SubsetDuplicates {

    public static void main(String[] args) {
        String s = "aab";
        ArrayList<String> result = new ArrayList<>();
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        subsets(new String(sArr), 0, "", result);
        System.out.println(result);
    }

    private static void subsets(String s, int index, String slate, ArrayList<String> result) {

        if(index == s.length()) {
            result.add(slate);
            return;
        }

        else {

            subsets(s, index + 1, slate + s.charAt(index), result);

            while(index < s.length() - 1 && s.charAt(index) == s.charAt(index + 1)) {
                index ++;
            }

            subsets(s, index + 1, slate, result);
        }
    }
}

import java.util.*;

public class PhoneNumbersWord {

    public static void main(String[] args) {

        Map<String, List<String>> charMap = new HashMap<>();
        charMap.put("1", Arrays.asList(""));
        charMap.put("2", Arrays.asList("a", "b", "c"));
        charMap.put("3", Arrays.asList("d", "e", "f"));
        charMap.put("4", Arrays.asList("g", "h", "i"));
        charMap.put("5", Arrays.asList("j", "k", "l"));
        charMap.put("6", Arrays.asList("m", "n", "o"));
        charMap.put("7", Arrays.asList("p", "q", "r", "s"));
        charMap.put("8", Arrays.asList("t", "u", "v"));
        charMap.put("9", Arrays.asList("w", "x", "y", "z"));

        ArrayList<String> result = new ArrayList<>();
        phoneWords("123", 0, charMap, "", result);
        System.out.println(result);

    }

    private static void phoneWords(String s, int index, Map<String, List<String>> charMap, String slate, ArrayList<String> result) {
        if (index == s.length()) {
            result.add(slate);
            return;
        }

        List<String> chars = charMap.get("" + s.charAt(index));

        for(String btnChar : chars) {
            phoneWords(s, index + 1, charMap, slate + btnChar, result);
        }
    }
}

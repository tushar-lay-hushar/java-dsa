import java.util.*;

public class Random {

    public static void main(String[] args) {
        String str = "AAABBBCCDAA";
        str = encoding(str);
        System.out.println(str);
        str = decoding(str);
        System.out.println(str);
    }

    static String encoding(String s) {
        StringBuilder newString= new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            int c = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                c++;
                i++;
            }
            newString.append(c);
            newString.append(s.charAt(i));
        }
        return newString.toString();
    }

    static String decoding(String s) {
        StringBuilder newString= new StringBuilder();
        for(int i = 1; i < s.length(); i = i + 2) {
            int count = Character.getNumericValue(s.charAt(i - 1));
            char ch = s.charAt(i);

            while (count > 0) {
                newString.append(ch);
                count--;
            }
        }
        return newString.toString();
    }
}

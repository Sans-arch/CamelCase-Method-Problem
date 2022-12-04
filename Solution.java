import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static String camelCase(String str) {
        if (str.length() == 0) return "";

        String[] wordsList = str.trim().split(" ");
        List<String> camelWords = new ArrayList<>();

        for (String word : wordsList) {
            camelWords.add(Solution.toUppercase(word));
        }
        
        return String.join("", camelWords);
    }

    public static String toUppercase(String word) {
        if (word.length() == 0) {
            return "";
        }

        Character firstLetter = Character.toUpperCase(word.charAt(0));
        String remainingLetters = word.substring(1);
        
        StringBuilder sb = new StringBuilder(String.valueOf(firstLetter));
        sb.append(remainingLetters);

        return sb.toString();
    }

}

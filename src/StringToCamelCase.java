import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringToCamelCase {
    /**
     * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
     * Examples
     * "the-stealth-warrior" gets converted to "theStealthWarrior"
     * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
     */

    public static void main(String[] args) {
        String str = "the-stealth-Warrior";
        System.out.println(camelCaseV2(str));
    }

    public static String camelCaseV1(String str) {
        String[] result = str.split("[\\W_]+");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            String word = result[i];
            if (i == 0 && word.startsWith(word.toLowerCase())) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0))
                        + word.substring(1).toLowerCase();
            stringBuilder.append(word);
        }
        return stringBuilder.toString();
    }

    public static String camelCaseV2(String str) {
        String[] words = str.split("[_\\-]");
        str = words[0];
        for (int i = 1; i < words.length; i++)
            str += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        return str;
    }

    public static String camelCaseV3(String str) {
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(str);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }

    public static String camelCaseV4(String str) {
        return Pattern.compile("[-|_](.)").matcher(str).replaceAll(r -> r.group(1).toUpperCase());
    }

    public static String camelCaseV5(String str) {
        String[] stringArray = str.split("[-|_]");
        return stringArray[0] + Arrays.stream(stringArray).skip(1).map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining());
    }
}

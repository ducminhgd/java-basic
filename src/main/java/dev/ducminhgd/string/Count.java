package dev.ducminhgd.string;

public class Count {

    public static int vowels(String s) {
        int stringLength = s.length();
        if (stringLength == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < stringLength; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'u' || c == 'o' || c == 'i') {
                count++;
            }
        }
        return count;
    }

    public static int vowels2(String s) {
        int stringLength = s.length();
        if (stringLength == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < stringLength; i++) {
            char c = s.charAt(i);
            if ("aeuoi".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}

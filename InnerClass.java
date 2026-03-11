import java.util.*;
public class OOPSBanner {
    static class CharacterPattern {
        char ch;
        String[] pattern;
        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }
    }
    public static void main(String[] args) {

        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] P = {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };

        String[] S = {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };

        Map<Character, CharacterPattern> map = new HashMap<>();
        map.put('O', new CharacterPattern('O', O));
        map.put('P', new CharacterPattern('P', P));
        map.put('S', new CharacterPattern('S', S));

        String word = "OOPS";

        for (int i = 0; i < 5; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(map.get(c).pattern[i] + " ");
            }
            System.out.println();
        }
    }
}

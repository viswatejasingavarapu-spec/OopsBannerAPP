import java.util.*;
public class OOPSBannerUC8 {
    public static void printBanner(String word, Map<Character, String[]> map) {
        for (int i = 0; i < 5; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(map.get(c)[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Map<Character, String[]> map = new HashMap<>();
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
        String word = "OOPS";

        printBanner(word, map);
    }
}

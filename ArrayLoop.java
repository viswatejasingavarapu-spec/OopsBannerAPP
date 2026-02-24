public class OopsBannerApp {
    public static void main(String[] args) {
String[] banner = {
String.join("", "  OOOOO   ", "  OOOOO   ", "  PPPPP    ", "  SSSSS   "),
String.join("", " O     O  ", " O     O  ", "  P     P  ", " S        "),
String.join("", " O     O  ", " O     O  ", "  PPPPP    ", "  SSSSS   "),
String.join("", " O     O  ", " O     O  ", "  P        ", "      S    "),
String.join("", "  OOOOO   ", "  OOOOO   ", "  P        ", "  SSSSS   ")
};
for (String line : banner) {
System.out.println(line);
}
}
}

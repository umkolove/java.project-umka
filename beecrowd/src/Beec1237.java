import java.util.Scanner;

public class Beec1237 {

    public static int longestCommonSubstring(String str1, String str2) {
        int maxLen = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                int len = 0;
                while (i + len < str1.length() && j + len < str2.length()
                        && str1.charAt(i + len) == str2.charAt(j + len)) {
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        System.out.println("Длина самой длинной общей подстроки: " + longestCommonSubstring(str1, str2));
    }
}

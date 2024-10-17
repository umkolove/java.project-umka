import java.util.Scanner;

public class Beec1332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String word = sc.next();
            if (word.length() == 3) {
                int oneMatches = countMatches(word, "one");
                int twoMatches = countMatches(word, "two");
                if (oneMatches >= 2)
                    System.out.println(1);
                else if (twoMatches >= 2)
                    System.out.println(2);
            } else if (word.length() == 5) {
                if (countMatches(word, "three") >= 4)
                    System.out.println(3);
            }
        }
        sc.close();
    }

    private static int countMatches(String word, String target) {
        int matches = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target.charAt(i)) {
                matches++;
            }
        }
        return matches;
    }
}

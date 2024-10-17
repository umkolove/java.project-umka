import java.util.Scanner;

public class Beec1551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String sentence = sc.nextLine().toLowerCase();
            boolean[] letters = new boolean[26];
            int count = 0;

            for (char ch : sentence.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    if (!letters[ch - 'a']) {
                        letters[ch - 'a'] = true;
                        count++;
                    }
                }
            }

            if (count == 26) {
                System.out.println("full");
            } else if (count >= 13) {
                System.out.println("almost full");
            } else {
                System.out.println("poorly designed");
            }
        }
    }
}

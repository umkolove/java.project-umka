import java.util.Scanner;

public class Beec1243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String statement = sc.nextLine();
        String[] words = statement.split("\\s+");

        int totalLength = 0;
        for (String word : words) totalLength += word.length();
        double avgLength = (double) totalLength / words.length;

        System.out.println(avgLength <= 3 ? 250 : avgLength <= 5 ? 500 : 1000);
    }
}

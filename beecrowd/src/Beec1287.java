import java.util.Scanner;

public class Beec1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("[Oo]", "0")
                .replaceAll("l", "1")
                .replaceAll("[, ]", "");

        try {
            long result = Long.parseLong(input);
            if (result > Integer.MAX_VALUE) throw new NumberFormatException();
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
    }
}

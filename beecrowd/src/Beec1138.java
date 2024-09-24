import java.util.Scanner;

public class Beec1138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите A: ");
        int A = scanner.nextInt();
        System.out.print("Введите B: ");
        int B = scanner.nextInt();

        int[] count = new int[10];

        for (int i = A; i <= B; i++) {
            for (char digit : String.valueOf(i).toCharArray()) {
                count[digit - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Цифра " + i + ": " + count[i]);
        }

    }
}

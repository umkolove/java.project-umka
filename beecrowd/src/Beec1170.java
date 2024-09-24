import java.util.Scanner;

public class Beec1170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :");
        double edaeda = scanner.nextDouble();

        int days = 0;

        while (edaeda > 1) {
            edaeda /= 2;
            days++;
        }

        System.out.println(days + " dias");

    }
}

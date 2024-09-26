import java.util.Scanner;

public class Beec1120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("цифру введи: ");
        String brokenDigit = scanner.next();

        System.out.print("введи значение: ");
        String contractValue = scanner.next();

        String fixedValue = contractValue.replace(brokenDigit, "");

        fixedValue = fixedValue.replaceFirst("^0+", "");

        System.out.println("ответ: " + fixedValue);

        System.out.println(fixedValue.isEmpty() ? "0" : fixedValue);
    }
}


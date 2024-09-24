import java.util.Scanner;

public class Beec1193{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите десятичное число: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Двоичное: " + binary);

        System.out.print("Введите двоичное число: ");
        String binaryInput = scanner.next();
        int decimalFromBinary = Integer.parseInt(binaryInput, 2);
        System.out.println("Десятичное: " + decimalFromBinary);

        System.out.print("Введите десятичное число для шестнадцатеричного: ");
        decimal = scanner.nextInt();
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Шестнадцатеричное: " + hexadecimal);

        System.out.print("Введите шестнадцатеричное число: ");
        String hexInput = scanner.next();
        int decimalFromHex = Integer.parseInt(hexInput, 16);
        System.out.println("Десятичное: " + decimalFromHex);

    }
}

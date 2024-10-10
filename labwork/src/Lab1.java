import java.util.Scanner;

public class Lab1 {
    public static void printGreeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        printGreeting(name);
    }
}

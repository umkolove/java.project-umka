public class Lab7 {

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String example = "Привет";
        String reversed = reverseString(example);
        System.out.println("Перевёрнутая строка: " + reversed);
    }
}

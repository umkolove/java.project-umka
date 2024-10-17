public class Lab8 {

    public static String repeatString(String input, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(input);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String example = "Java";
        int repeatCount = 3;
        String repeated = repeatString(example, repeatCount);
        System.out.println(repeated);
    }
}

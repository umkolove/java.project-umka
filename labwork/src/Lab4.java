public class Lab4 {

    public static int countVowels(String input) {
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU";
        int count = 0;

        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String example = "Привет";
        int vowelCount = countVowels(example);
        System.out.println("Количество гласных: " + vowelCount);
    }
}

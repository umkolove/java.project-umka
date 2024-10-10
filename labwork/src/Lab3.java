public class Lab3 {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 1, 7, 2};
        int max = findMax(numbers);
        System.out.println("Максимальный элемент: " + max);
    }
}

public class Lab9 {

    public static int sumArray(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4};
        int totalSum = sumArray(exampleArray);
        System.out.println("Сумма элементов массива: " + totalSum);
    }
}

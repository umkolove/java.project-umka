public class Lab5 {

    public static double calculateAverage(int[] array) {
        if (array.length == 0) return 0.0;

        double sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5};
        double average = calculateAverage(exampleArray);
        System.out.println("Среднее значение: " + average);
    }
}

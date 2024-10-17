public class Lab10 {

    public static int[] squareArray(int[] array) {
        int[] squaredArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        return squaredArray;
    }

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4};
        int[] squared = squareArray(exampleArray);

        // Вывод результата
        for (int num : squared) {
            System.out.print(num + " ");
        }
    }
}

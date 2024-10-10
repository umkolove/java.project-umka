public class  Lab2{
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        displayArray(numbers);
    }
}

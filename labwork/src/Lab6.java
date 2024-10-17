public class Lab6 {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double exampleFahrenheit = 98.6;
        double celsius = fahrenheitToCelsius(exampleFahrenheit);
        System.out.println("Температура в градусах Цельсия: " + celsius);
    }
}

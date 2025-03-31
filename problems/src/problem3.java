class problem3<T extends Number> {
    public T add(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    public static void main(String[] args) {
        problem3<Integer> intCalc = new problem3<>();
        System.out.println(intCalc.add(5, 10));

        problem3<Double> doubleCalc = new problem3<>();
        System.out.println(doubleCalc.add(3.5, 2.5));
    }
}
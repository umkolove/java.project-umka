class problem8<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Использование raw type
        problem8 rawContainer = new problem8();
        rawContainer.setValue("Hello");
        rawContainer.setValue(123);

        System.out.println(rawContainer.getValue());
    }
}

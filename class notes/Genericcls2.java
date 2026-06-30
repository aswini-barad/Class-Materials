class Demo {

    public static <T> void print(T value) {
        System.out.println(value);
    }

    public static void main(String args[]) {

        print("Java");
        print(100);
        print(25.5);
        print(true);
    }
}
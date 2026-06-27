class Demo {//variable length
    static void sum(int... numbers) {
        int total = 0;

        for (int n : numbers) {
            total += n;
        }

        System.out.println("Sum = " + total);
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(1, 2, 3, 4, 5);
    }
}
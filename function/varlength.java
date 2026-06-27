class VarLengthAdd {

    static void add(int... num) {
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        add(10, 20);
        add(5, 10, 15);
        add(6, 7, 8, 9, 10, 12, 41);
    }
}
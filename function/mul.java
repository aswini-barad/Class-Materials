class VarLengthmul {

    static void mul(int... num) {
        int mul = 1;

        for (int i = 0; i < num.length; i++) {
            mul = mul * num[i];
        }

        System.out.println("Multiplication = " + mul);
    }

    public static void main(String[] args) {

        mul(10, 20,30);
        mul(5, 10, 15);
        mul(6, 7, 8, 9, 10, 12, 41);
    }
}
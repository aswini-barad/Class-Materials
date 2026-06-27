class VarLengthDiv {

    static void div(int... num) {

        if (num.length == 0) {
            System.out.println("No numbers provided.");
            
        }

        double result = num[0];

        for (int i = 1; i < num.length; i++) {

            if (num[i] == 0) {
                System.out.println("Division by zero is not allowed.");
                
            }

            result = result / num[i];
        }

        System.out.println("Division = " + result);
    }

    public static void main(String[] args) {

        div(100, 2);
        div(100, 2, 5);
        div(120, 2, 3, 4);
    }
}
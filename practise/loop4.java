class Test {
    public static void main(String arg[]) {
        int i;
        for(i = 1; i < 6; i++) {
            System.out.println(i);

            if(i == 3) {
                continue;
            }

            System.out.println("hi");
        }

        System.out.println("main end");
    }
}
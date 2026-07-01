public class Ex2 {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30};

        try {
            System.out.println(arr[2] / 0);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }

        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("main end");
    }
}
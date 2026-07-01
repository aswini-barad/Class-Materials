public class Ex1 {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30};

        try {
            System.out.println(arr[3]);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("main end");
    }
}
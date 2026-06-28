import java.util.*;

public class mindiffh {

    public static int getmindiff(int arr[], int k) {
        int n = arr.length;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] - k < 0)
                continue;

            int smallest = Math.min(arr[0] + k, arr[i] - k);
            int largest = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            ans = Math.min(ans, largest - smallest);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 10};
        int k = 2;

        System.out.println(getmindiff(arr, k));
    }
}
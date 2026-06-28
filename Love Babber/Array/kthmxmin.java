import java.util.*;
public class kthmxmin {
    public static int kmin(int arr[],int k){
     int n=arr.length;
     Arrays.sort(arr);
     return arr[k-1];
     

    }
    public static int kmax(int arr[],int k){
        int  n=arr.length;
        Arrays.sort(arr);
        return arr[n-k];

    }
   public static void main(String[] args) { 
    int arr[]={5,4,2,4,5,2,6,54,2,5,2,45,2,4};
    int k=3;
    System.out.println(kmax(arr, k));
    System.out.println(kmin(arr, k));
        
    }
    
}

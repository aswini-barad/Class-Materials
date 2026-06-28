import java.util.*;
public class reverse {
    public static void rev(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end)
{
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;


start++;
end--;
}
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,4,2,5,6,4};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
 
    
    
}

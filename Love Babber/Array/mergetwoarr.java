//merge 2 sorted array without any extra space
//brute force
import java.util.*;
class mergetwoarray{
	static void merge(int arr1[],int arr2[]){
		int n=arr1.length;
		int m=arr2.length;
		int i=n-1;
		int j=0;
		while(i>=0&&j<m){
			if(arr1[i]>arr2[j]){
				 int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
			}
			i--;
			j++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}
	public static void main(String args[]){
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};

        merge(arr1, arr2);

        System.out.println("Array 1");
        for (int x : arr1)
            System.out.print(x + " ");

        System.out.println();

        System.out.println("Array 2");
        for (int x : arr2)
            System.out.print(x + " ");
    }
}
	


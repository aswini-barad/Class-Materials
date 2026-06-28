import java.util.*;
class klargesmall{
	public static void main(String args[]){
	int arr[] = {12, 45, 7, 89, 23, 5};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter k");
	int k=sc.nextInt();
	Arrays.sort(arr);
	int klargest=arr[arr.length-k];
	int ksmllest=arr[k-1];
	System.out.println("kth largest"+klargest);
	System.out.println("Kth smallest"+ksmllest);


	


		}
	}
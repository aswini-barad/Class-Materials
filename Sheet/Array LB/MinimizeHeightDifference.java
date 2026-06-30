import java.util.*;
class minhdiff{
	static int getdiff(int arr[],int k){
	Arrays.sort(arr);
	int n=arr.length;
	int ans=arr[n-1]-arr[0];
	int smallest=arr[0]+k;
	int largest=arr[n-1]-k;
	for(int i=0;i<n-1;i++){
		int min=Math.min(smallest,arr[i+1]-k);
		int max=Math.max(largest,arr[i]+k);
     if(min<0)
     	continue;
     ans = Math.min(ans, max - min);

}
	return ans;
}
	public static void main(String args[]){
		int arr[] = {1, 5, 8, 10};
		int k=2;
		System.out.println(getdiff(arr,k));

	}
	}

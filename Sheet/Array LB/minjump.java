//Minimum no of jumps
class minjum{
static int minjumps(int arr[]){
	int n=arr.length;
	if(n<=1){
	return 0;
	}
	if(arr[0]==0){
	return -1;
	}
	int maxreach=arr[0];
	int steps=arr[0];
	int jumps=1;

	for(int i=1;i<n;i++){
	
	if(i==n-1)
	{
	return jumps;
}


	
	maxreach=Math.max(maxreach,i+arr[i]);
	steps--;
	if(steps==0){
	jumps++;

	
	if(i>=maxreach)
	return -1;
steps=maxreach-i;
}
}
return -1;


	
}
	

	public static void main(String args[]){
	 int arr[] = {2, 3, 1, 1, 4};

        System.out.println(minjumps(arr));

	}
}
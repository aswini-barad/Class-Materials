//Find Duplicate in an Array of N+1 Integers
//Brute force
class duplicate{
	static int duplicate(int arr[]){
	int n=arr.length;
	for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
	if(arr[i]==arr[j]){
	    return arr[i];
	}
	}
	}
	return -1;
	}
	public static void main(String args[]){
	int arr[]={5,5,5,4,1,7,1};
	int res=duplicate(arr);
	if(res!=-1){
	System.out.println("Duplicate:"+res);
	}else{
	System.out.println("Not Duplicate");
	}
	}
}
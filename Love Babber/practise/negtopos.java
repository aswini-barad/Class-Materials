class negtopos{
	public static void main(String args[]){
	int arr[]={45,-52,69,-54,123,410,-58,-58,41,-58};
	int left=0;
	int right=arr.length-1;
	while(left<=right){
	if(arr[left]<0){
	left++;
	}else if(arr[right]>=0){
	right--;
	}else{
	int temp=arr[left];
	arr[left]=arr[right];
	arr[right]=temp;
	left++;
	right--;

	}

	}
	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]+"");
	}
	
	}
}
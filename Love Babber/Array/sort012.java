class sort012{//dutch national flag algo
	public static void main(String srgs[]){
	int arr[]={1,2,0,2,2,2,1};
	int low=0;
    int mid=0;
    int high=arr.length-1;
    while(mid<=high){
    if(arr[mid]==0){
    int temp=arr[mid];
    arr[mid]=arr[low];
    arr[low]=temp;
    mid++;
    low++;
    }
    else if(arr[mid]==1){
    mid++;

    }else{
    	 int temp=arr[mid];
    arr[mid]=arr[high];
    arr[high]=temp;
    high--;
    }
}
  for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}
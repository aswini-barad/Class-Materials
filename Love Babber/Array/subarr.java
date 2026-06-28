//find largest sum contigeos subarr
class largestsubarr{
	public static void main(String args[]){
		int arr[]={5,4,1,2,8,7,9,3};
		int currsum=arr[0];
		int maxsum=arr[0];
		for(int i=1;i<arr.length;i++){
		if(currsum+arr[i]>arr[i]){
			currsum=currsum+arr[i];
		}else{
			currsum=arr[i];
		}
			if(currsum>maxsum){
				maxsum=currsum;
			}
		}
		System.out.println("max sum is:"+maxsum);
		
	}
}

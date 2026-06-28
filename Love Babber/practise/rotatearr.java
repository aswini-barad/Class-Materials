//Cyclically rotate an array by one
// Put the saved last element at index 0.
// Easy Trick to Remember
// Save the last element.
// Shift all elements one step to the right.
	class rotate{
		public static void main(String args[]){
			int arr[]={4,5,2,1,6,3,7};
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--){
				arr[i]=arr[i-1];
	}
	       arr[0]=temp;
	       System.out.println("After Rotation:");
	       for(int i=0;i<arr.length;i++){
	       	System.out.println(arr[i]+"\t");
	       }
}
}
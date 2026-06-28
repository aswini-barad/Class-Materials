public class negative {
    public static void negative(int arr[]){
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

    }
 public static void main(String[] args) {
    int arr[]={1,-5,4,-8,2,-5,-4,-5,5,4};
    negative(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
      
 }
    
    
}

public class maxmin {
    public static void maxmin(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
    
    public static void main(String[] args) {
        int arr[]={5,6,1,2,5,1,5,1,115,2};
         maxmin(arr);
        
        
    }
    
}

public class rotatearray1 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,2,41};
       int n=arr.length;
       int temp=arr[n-1];//store the last element
       for(int i=n-1;i>0;i--){
        arr[i]=arr[i-1];//right shift
       }
        arr[0]=temp;
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       
        
    }
}
}

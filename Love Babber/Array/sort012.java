public class sort012 {//Dutch National Flag algo
    public static void sort(int arr[]){
        int n=arr.length;
        int mid=0;
        int low=0;
        int high=n-1;
        while(mid<=high){
           if(arr[mid]==0){
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            low++;
            mid++;

           }
        else if(arr[mid]==1){
            mid++;
           }
        else{
            int temp=arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;
            high--;
            
           }
}
    }
    public static void main(String[] args) {
        int arr[]={0,0,2,2,1,2,1,0,2,1,1,2,0,0,0};
        int num=arr.length;
        sort(arr);
        for(int i=0;i<num;i++){
            System.out.println(arr[i]+" ");
        }
}
    }

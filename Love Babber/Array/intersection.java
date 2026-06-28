public class intersection {
    public static void intersection(int a[],int b[]){
        int i=0;
        int j=0;
        while(i<a[i]&&j<b[j]){
            if(a[i]==b[j]){
                 System.out.println(a[i]+"");
                 i++;
                 j++;

            }else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }

        }

    }

    public static void main(String[] args) {
     int a[]={2,4,6,8,10,18};
    int b[]={5,6,7,8,9,12,14};
    intersection(a, b);
    }
}

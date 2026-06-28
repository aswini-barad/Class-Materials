public class union {
    public static void union(int a[],int b[]){
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                System.out.println(a[i]+"");
                i++;
            }else if(a[i]>b[j]){
                System.out.println(b[j]+"");
                j++;
            }else{
                System.out.println(a[i]+"");
                i++;
                j++;
            }
        }
        while(i<a.length){
            System.out.println(a[i]+"");
            i++;
        }
        while(j<b.length){
            System.out.println(b[j]+"");
            j++;
        }
    }

public static void main(String[] args) {
    int a[]={2,4,6,8,10,18};
    int b[]={5,6,7,8,9,12,14};
    union(a, b);
        
    }
}

import java.util.*;
class intersection{
	static void intersec(int a[],int b[]){
		int i=0;
		int j=0;
		while(i<a.length&& j<b.length){
			if(a[i]==b[j]){
				System.out.println(b[j]+"");
				i++;
				j++;
			}else if(a[i]<b[j]){
				i++;
			
			}else{
				j++;
			}
			

			}
		}
	
	public static void main(String args[]){
		int a[]={1,2,3,4,5};
		int b[]={4,5,6,7,8,9};
		
		System.out.println("intersection");
		intersec(a,b);

	}
}

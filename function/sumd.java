import java.util.*;
class sumd{
static void sumdigit(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
      int n=sc.nextInt();

	int r;
	int s=0;
	while(n!=0){
	r=n%10;
	s=s+r;
	n/=10;
	}
	System.out.println("sum of digits:"+s);
	}

public static void main(String args[]){

     sumdigit();
 }
}

	
	


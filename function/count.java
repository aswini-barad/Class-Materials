import java.util.*;
class countno{
static void count(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int c=0;
	if(num==0){
		c=1;

	}else{
		Math.abs(num);
	}
	while(num>0){
		num/=10;
		c++;
	}
	System.out.println("No of digits:"+c);


}
	public static void main(String args[]){
		count();

	}
}
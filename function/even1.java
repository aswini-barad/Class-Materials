import java.util.*;//no return with arg
class check{
static void check(int num){
	if(num%2==0){
	System.out.println("even");
	}else{
	System.out.println("odd");
	}
}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	

	check(5);

}
	}


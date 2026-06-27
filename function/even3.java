import java.util.*;//return type with arg
class check{
static int check(int num){
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	
	if(num%2==0){
	System.out.println("even");
	}else{
	System.out.println("odd");
	}
	return num;
}
	public static void main(String args[]){

	check(5);


	}
}

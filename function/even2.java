import java.util.*;// return type with no arg
class check{
static int check(){
	if(num%2==0){
	System.out.println("even");
	}else{
	System.out.println("odd");
	}
	return num;
}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	

	check();

}
	}


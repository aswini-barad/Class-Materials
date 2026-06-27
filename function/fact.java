import java.util.*;//
class fact{
	static long fact(int num){
	long r=1;
	for(int i=1;i<=num;i++){
	r*=i;

	}
	return r;

	}
	public static void main(String args[]){
		int num=5;
		long fact=fact(num);
		System.out.println("factorial of"+num+"is:"+fact);
	}
}
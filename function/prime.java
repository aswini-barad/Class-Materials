import java.util.*;
class prime{
	static boolean isprime(int n){
		
		if(n<=1){
			return false;
		}
			for(int i=2;i<n;i++){
				if(n%i==0){
				return false;
			}
		}

			
			return true;
		}
		
	
public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(isprime(n)){
			System.out.println("prime number");
		}else{
			System.out.println("Not a prime number");
		}
	}
}


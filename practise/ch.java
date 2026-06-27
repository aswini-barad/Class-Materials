import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
	char ch=sc.next().charAt(0);
	if(ch>='a'&& ch<='z'){
	System.out.println("lowercase");

	}else if(ch>='A'&& ch<='Z'){
	System.out.println("uppercase");

	}else{
	System.out.println("special symbol");

	}
	}
}
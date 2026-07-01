//take a string
//count the no of digits
//count te no of alphabayes
import java.util.*;
class str{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
	int c=0;
	if(num==0){
		c=1;
	}else{
		num=Math.abs(num);
	
	while(num>0){
	num/=10;
	c++;
	
	}
}
	System.out.println("no of digits:"+c);

	}
}
	}
}
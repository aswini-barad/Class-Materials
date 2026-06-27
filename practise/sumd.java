class test{
	public static void main(String args[]){
	int n=125,r,s=0;
	while(n!=0){
	r=n%10;
	s=s+r;
	n/=10;
	}
	System.out.println("sum of digits:"+s);
	}
}
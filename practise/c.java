class count{
	public static void main(String args[]){
	int num=456;
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
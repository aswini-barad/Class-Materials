import java.util.Scanner;
class Test
{
    static int add(int no1,int no2)
    {
         
        int s=no1+no2;
       
        return s;
    }
	public static void main(String arg[])
	{
	 Scanner sc=new Scanner(System.in);
        System.out.println("enter two nos ");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
	  int res=add(no1,no2);
	  System.out.println("sum="+res);
	  
	}
}
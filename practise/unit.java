/*
wap take elect bill from keyboad .monthly minium charge 30.
if use 
1 to 50  per unit  1
51 to 100  per unit 2
101 to 200 per unit 3
above 200  per unit 4
if amount>600 above extra 10%
*/
import java.util.Scanner;
class Test
{
    public static void main(String arg[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a unit ");
         int u=sc.nextInt();
         double amt;
         if(u==0)
         {
            amt=30;
         }
         else if(u<=50)
         {
            amt=30+u*1;
         }
         else if(u<=100)
         {
            amt=30+50+(u-50)*2;
         }
          else if(u<=200)
         {
            amt=30+50+100+(u-100)*3;
         }
         else
         {
            amt=30+50+100+300+(u-200)*4;
         }

         if(amt>=600)
         {
            amt=amt+amt*0.1;
         }
         System.out.println("total amount="+amt);
    }
}

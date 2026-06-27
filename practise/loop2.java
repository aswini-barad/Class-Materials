import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a salary ");
         double sal=sc.nextDouble();
         double da=0,hra=0,total;
         if(sal>=5000)
         {
               da=sal*0.3;
               hra=sal*0.2;
         }
         else
         {
              da=sal*0.1;
              hra=sal*0.05;
         }
         total=sal+da+hra;
         System.out.println("basic sal="+sal);
         System.out.println("da="+da);
         System.out.println("hra="+hra);
         System.out.println("total="+total);



     }
}
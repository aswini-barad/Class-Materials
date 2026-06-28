import java.util.Scanner;

public class fdplusld {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
     System.out.print("enter the number");
     int num=sc.nextInt();
          int lastnum=num%10;
         int result1=0;
      while(num!=0){
        result1=num%10;
            num=num/10;
      }
       System.out.println(result1+lastnum);
    
   
    
    
    }
}

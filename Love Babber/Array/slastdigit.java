import java.util.Scanner;

public class slastdigit {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
     System.out.print("enter the number");
     int lastnum=0;
     int num=sc.nextInt();
     int digit=num/10%10;
    int result=lastnum+digit;
     System.out.println(result);

    }
}


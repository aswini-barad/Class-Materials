import java.util.*;
public class fdigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int result=0;
        while(num!=0){
            System.out.println("hi");
            result=num%10;
            num=num/10;

        }
    
        if(result%2==0){
            System.out.println("even num");
        }else{
            System.out.println("odd num");
        }
        
          
        }
     
          }
    


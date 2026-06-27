import java.util.Scanner;//return type with no argument

class SimpleInterest {
    static double p, r, t;

    static double si() { 
        double s = (p * r * t) / 100;
        System.out.println("The Simple Interest is: " + s);
        return s;
    } 

    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter Principal (p): "); 
        p = sc.nextDouble(); 
        
        System.out.print("Enter Rate (r): "); 
        r = sc.nextDouble(); 
        
        System.out.print("Enter Time (t): "); 
        t = sc.nextDouble(); 
        
        si(); 
        
        sc.close();
    } 
}

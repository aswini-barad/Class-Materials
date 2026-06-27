import java.util.Scanner;

class SimpleInterest {
    
    static void si(double p, double r, double t) {
        double s = (p * r * t) / 100;
        System.out.println("The Simple Interest is: " + s);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal (p): ");
        double p = sc.nextDouble();
        
        System.out.print("Enter Rate (r): ");
        double r = sc.nextDouble();
        
        System.out.print("Enter Time (t): ");
        double t = sc.nextDouble();
        
        si(p, r, t);
        
    }
}

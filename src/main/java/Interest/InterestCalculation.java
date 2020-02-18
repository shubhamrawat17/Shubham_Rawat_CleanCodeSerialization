package Interest;
import java.util.Scanner;
public class InterestCalculation
{
    public static void main(String[] args) {
        double p;
        double r;
        double t;
        String find;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p = sc.nextDouble();
        System.out.println("Enter the interest rate");
        r  = sc.nextDouble();
        System.out.println("Enter the time period in years");
        t = sc.nextDouble();
        sc.nextLine();
        System.out.println("Simple or Compound interest ??");
        find = sc.nextLine();
        if(find=="Simple")
        {
            Simpleinterest sInterest = new Simpleinterest(p,r,t);
            double interest1 = sInterest.interest();
            System.out.println("Total interest"+interest1);
            double amount = interest1 + p;
            System.out.println("Total amount to be paid after "+t+" years is "+amount);
        }
        else
        {
            Compoundinterest cInterest = new Compoundinterest(p,r,t);
            double interest2 = cInterest.interest();
            System.out.println("Total interest "+interest2);
            double amount = interest2 + p;
            System.out.println("Total amount to be paid after "+t+" years is "+amount);
        }
    }
}

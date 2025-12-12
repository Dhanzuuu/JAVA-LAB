import java.util.Scanner;

public class quadratic
{
    public static void main (String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter co-efficient of a");
        double a = input.nextDouble();
        System.out.println("Enter co-efficient of b");
        double b = input.nextDouble();
        System.out.println("Enter co-efficient of c");
        double c = input.nextDouble();
        double d = b*b-4*a*c;

        if(d>0)
        {
            double r1= (-b + Math.sqrt(d)/(2*a));
            double r2= (-b - Math.sqrt(d)/(2*a));
            System.out.println("The roots are real and distinct");
            System.out.println("Root1="+r1);
            System.out.println("Root2="+r2);
        }
        else if (d==0)
        {
            double r1 = -b/(2*a);
            double r2 =r1;
            System.out.println("The roots are real and equal");
            System.out.println("Root1="+r1);
            System.out.println("Root2="+r2);
        }
        else
        {
            double realpart = -b/(2*a);
            double imgpart = Math.sqrt(-d)/(2*a);
            System.out.println("The roots are complex");
            System.out.println("Root1="+ realpart + "+" + imgpart + "i");
            System.out.println("Root2="+ realpart + "-" + imgpart + "i");

        }  input.close();
    } 

    
}

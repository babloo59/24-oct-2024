import java.util.*;

public class function {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int calculateSum(int a,int b) {
        int sum = a + b;
        return sum;
    }

    public static int calculateProduct(int a, int b) {
        return a*b;
    }

    public static void calculateFactorial(int n) {
        if(n<0) {
            System.out.println("Invalid Number");
            return;
        }
        int fac = 1;
        for(int i=1;i<=n;i++) {
            fac *= i;
        }
        System.out.println("Factorial of "+n+" is "+fac);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println("Enter Two Numbers:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // printMyName(name);

        // int sum = calculateSum(a, b);
        // System.out.println("Sum of 2 numbers is "+sum);

        // System.out.println("Product of 2 numbers is "+calculateProduct(a, b));

        System.out.println("Enter a no.");
        int n = sc.nextInt();
        // System.out.println("Factorial of is"+calculateFactorial(n));
        calculateFactorial(n);
    }
}

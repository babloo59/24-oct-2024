import java.util.*;

public class advancePattern {
    public static void main(String args[]) {
        int n=5;

        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }

            for(int j=0;j<2*(n-i-1);j++) {
                System.out.print("  ");
            }

            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        // System.out.println();
        for(int i=n-1;i>=0;i--) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }

            for(int j=0;j<2*(n-i-1);j++) {
                System.out.print("  ");
            }

            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        for(int i=n;i>0;i--) {
            for(int j=0;j<i-1;j++) {
                System.out.print("  ");
            }

            for(int j=0;j<n;j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        System.out.println();
        System.out.println();
        for(int i=n;i>0;i--) {
            for(int j=0;j<i-1;j++) {
                System.out.print(" ");
            }

            for(int j=0;j<=2*(n-i+1);j++) {
                if(j%2==0) {
                    System.out.print(" ");
                }
                else{
                    System.out.print(n-i+1);
                }  
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++)  {
            for(int j=0;j<=n-i-2;j++) {
                System.out.print("  ");
            }

            for(int j=0;j<=i;j++) {
                System.out.print(1+i-j+" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j+1+" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print("  ");
            }

            for(int j=0;j<2*i+1;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("  ");
            }

            for(int j=2*(n-i)-1;j>0;j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print("  ");
            }

            for(int j=0;j<2*i+1;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("  ");
            }

            for(int j=2*(n-i-1)-1;j>0;j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

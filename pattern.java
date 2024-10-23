import java.util.*;

public class pattern {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i==0||j==0||i==n-1||j==n-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=n;j>0;j--) {
                if(i==0||j==1||i==n-1||j==i+1||j==n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i==0||j==0||i==n-1||j==i||j==n-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=n;j>0;j--) {
                if(j<=i+1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=n;j>0;j--) {
                if(j==i+1||j==1||i==n-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=n;i>0;i--) {
            for(int j=0;j<i;j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }

        int k=1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                if((i+j)%2==0) {
                    System.out.print("1"+" ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

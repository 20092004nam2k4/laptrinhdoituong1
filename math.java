import java.util.Scanner;

public class math {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("nhập a : ");
        a = sc.nextDouble();
        System.out.print("nhập b : ");
        b = sc.nextDouble();
        System.out.print("nhập c : ");
        c = sc.nextDouble();
        if (a != 0) {
            double tong = (c-b)/a ;
            System.out.println("Equation pass with :" + tong);
        } else {
            if (b==0) {
                System.out.printf("The solution is al x!");
            } else {
                System.out.printf("no solutiion");
            }
        }
    }
}
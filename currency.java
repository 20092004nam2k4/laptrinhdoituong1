import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        double VND = 23000 ;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền USD : ");
        USD = sc.nextDouble();
        double quydoi = USD * 23000;
        System.out.print("Giá trị VNĐ : " + quydoi);
    }
}

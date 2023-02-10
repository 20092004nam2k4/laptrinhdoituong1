import java.util.Scanner;

public class tinhday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("nhập tháng bạn muốn tính số ngày :");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");
                break;

            case 1:
                System.out.print("The month '" + month + "' has 31 days!");
                break;
            case 3:
                System.out.print("The month '" + month + "' has 31 days!");
                break;
            case 4:
                System.out.printf("The month '" + month + "' has 30 days!");
                break;
            case 5:
                System.out.printf("The month '" + month + "' has 30 days!");
                break;
            case 6:
                System.out.println("The month '" + month + "' has 31 days!");
                break;
            case 7:
                System.out.printf("The month '" + month + "' has 30 days!");
                break;
            case 8:
                System.out.printf("The month '" + month + "' has 30 days!");
                break;
            case 9:
                System.out.printf("The month '" + month + "' has 30 days!");
                break;
            case 10:
                System.out.printf("The month '" + month + "' has 30 days!");
                break;
            case 11:
                System.out.printf("The month '" + month + "' has 30 days!");
                break;
            case 12:
                System.out.print("The month '" + month + "' has 31 days!");
                break;

        }
    }
}

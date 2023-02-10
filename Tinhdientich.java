import java.util.Scanner;

public class Tinhdientich {
    public static void main(String[] args) {
        Float width;
        Float height;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("nhập chiều dài :");
        width = scanner.nextFloat();

        System.out.printf("nhập chiều rộng :");
        height = scanner.nextFloat();
        Float S = width * height;

        System.out.printf(" diện tích :" + S);
    }
}

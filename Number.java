import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short number;

        System.out.printf("nhập dãy số cần chuyển đổi : ");
        number = scanner.nextShort();
        String chu[] = { "","one", "two", "three", "four", "five", "six","seven", "eight", "nine", "ten"};
        String num[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", ""};
        int name = number % 3 ;

        System.out.println(chu[number]);


    }
}

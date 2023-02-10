import java.util.Scanner;

public class TinhBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bmi, weight , height;

        System.out.println("Enter weight : ");
        weight = scanner.nextDouble();

        System.out.println("Enter height : ");
        height = scanner.nextDouble();
         bmi = weight / (height * height);
        System.out.println("bmi : " + bmi);

        if (bmi < 18.5) {
            System.out.println("thiếu cân");
        } else if (bmi < 25.0) {
            System.out.println("bình thường");
        } else if (bmi < 30.0 ) {
            System.out.println("thừa cân");
        }else {
            System.out.println("béo phì");
        }
    }
}

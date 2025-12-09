import java.util.Scanner;

public class a_bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap can nang (kg): ");
        float weight = sc.nextFloat();

        System.out.print("Nhap chieu cao (m): ");
        float height = sc.nextFloat();

        double bmi = weight / Math.pow(height,2);

        if (weight > 0 && height > 0) {
            if (bmi < 18.5) {
                System.out.println("Underweight");
            }
            else if (bmi < 25.0) {
                System.out.println("Normal");
            }
            else if (bmi < 30.0) {
                System.out.println("Overweight");
            }
            else if (bmi <= 30.0) {
                System.out.println("Obese");
            }
        }
        else {
            System.out.println("can nang hoac chieu cao khong hop le");
        }
    }
}

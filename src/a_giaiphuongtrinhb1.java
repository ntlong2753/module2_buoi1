import java.util.Scanner;

public class a_giaiphuongtrinhb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap a: ");
        float a = sc.nextFloat();

        System.out.print("nhap b: ");
        float b = sc.nextFloat();

        System.out.print("nhap c: ");
        float c = sc.nextFloat();

        float x;
        if (a != 0){
            x = (c - b) / a;
            System.out.println("x = " + x);
        }
        else{
            if ( c - b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}

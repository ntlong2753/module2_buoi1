import java.util.Scanner;

public class baitapcoban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính đường tròn r: ");
        double r = sc.nextDouble();
        double chu_vi = 2 * Math.PI * r;
        double dien_tich = Math.PI * Math.pow(r,2);
        System.out.println("chu vi hình tròn là: " + chu_vi + " đvđ");
        System.out.println("diện tích hình tròn là:  " + dien_tich + " đvđ");
    }
}

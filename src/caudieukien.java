import java.util.Scanner;

public class caudieukien {
    public static void main(String[] args){

        // nhập vào bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào điểm TB: ");
        double tb = sc.nextDouble();

        // kiểm tra điều kiện
        if(tb >= 5.0 ){
            System.out.println("Bạn đỗ");
            System.out.println("Chúc mừng bạn");
        }
        else{
            System.out.println("Bạn đã tạch");
        }
    }

}

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        /*
        // khởi tạo 1 đối tượng scanner
        Scanner sc = new Scanner(System.in);

        // cho phép nhập chuỗi
        System.out.println("mời nhập vào gì đó: ");
        String mk1 = sc.nextLine();
        System.out.println("hiển thị: " + mk1);

        // nhập số nguyên
        System.out.println("nhập số nguyên: ");
        int a = sc.nextInt();
        System.out.println("giá trị vừa nhập: " + a);

        // nhập số float
        System.out.println("nhập giá trị số thực: ");
        float x = sc.nextFloat();
        System.out.println("giá trị vừa nhập: " + x);

        // cho phép nhập chuỗi
        System.out.println("xin mời cụ nhập vào gì đó: ");
        String mk2 = sc.nextLine();
        System.out.println("hiển thị: " + mk2);
        */

        // nhập chuỗi
        System.out.println("mời cụ nhập tên: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("tên của cụ là: " + ten);

        // nhập chuỗi
        System.out.println("mời cụ nhập gt: ");
        String gt = new Scanner(System.in).nextLine();
        System.out.println("gt của cụ là: " + gt);

        // nhập float
        System.out.println("mời cụ nhập chiều cao: ");
        float cao = new Scanner(System.in).nextFloat();
        System.out.println("chiều cao của cụ là: " + cao);

        // nhập chuỗi
        System.out.println("mời cụ nhập gt: ");
        String gt2 = new Scanner(System.in).nextLine();
        System.out.println("gt của cụ là: " + gt2);

    }
}

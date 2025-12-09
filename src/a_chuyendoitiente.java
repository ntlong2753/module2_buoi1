import java.util.Scanner;

public class a_chuyendoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 26360;

        System.out.print("nhap so tien can chuyen doi (USD): ");
        double usd = sc.nextDouble();

        double quydoi = usd * vnd;
        System.out.println(usd + " USD = " + quydoi + " VND");
    }
}
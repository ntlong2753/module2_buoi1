import java.util.Scanner;

public class a_ngaythang_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("thang: ");
        int thang = sc.nextInt();

        System.out.print("nam: ");
        int nam = sc.nextInt();

        if(thang >= 1 && nam > 0){ // kiểm tra điều kiện nhập
            //kiểm tra số ngày trong tháng
            if (thang == 1 || thang == 3 || thang == 5 || thang == 7
                    || thang == 8 || thang == 10 || thang ==12) {
                System.out.println("thang " + thang +  " nam " + nam + " co 31 ngay");
            }
            else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                System.out.println("thang " + thang + " nam " + nam + " co 30 ngay");
            }

            else if(thang == 2){
                // kiểm tra năm nhuận
                boolean namNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
                if(namNhuan){
                    System.out.println("thang " + thang + " nam " + nam + " co 29 ngay");
                }
                else{
                    System.out.println("thang " + thang + " nam " + nam + " co 28 ngay");
                }
            }
        }
        else{
            System.out.println("so thang hoac nam khong hop le");
        }

    }
}

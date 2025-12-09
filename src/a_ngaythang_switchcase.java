import java.util.Scanner;

public class a_ngaythang_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("thang: ");
        int thang = sc.nextInt();

        System.out.println("nam: ");
        int nam = sc.nextInt();

        if (thang >= 1 && nam > 0){
            switch(thang) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    System.out.println("thang " + thang + " nam " + nam + " co 31 ngay");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("thang " + thang + " nam " + nam + " co 30 ngay");
                    break;
                case 2:
                    boolean namNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
                    if(namNhuan){
                        System.out.println("thang " + thang + " nam " + nam + " co 29 ngay");
                    }
                    else{
                        System.out.println("thang " + thang + " nam " + nam + " co 28 ngay");
                    }
            }
        }
        else {
            System.out.println("thang hoac nam khong hop le");
        }
    }
}

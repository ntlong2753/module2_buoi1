public class toantulogic {
    public static void main(String[] args) {
        int i = 15;
        // kiểm tra gia trị i > 0 và i < 10 không
        System.out.println("kết quả 1: " + (i > 0 && i < 10));

        // kiểm tra gia trị i > 10 hoặc i < -1 không
        System.out.println("kết quả 2: " + (i > 10 || i < -1));

        // phép phủ định
        System.out.println("kết quả 3: " + !(i > 10 || i < -1));

    }
}

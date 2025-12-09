public class epkieudulieu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = (double) a / b; // ép int >> double
        System.out.println("kết quả: " + kq);

        // ép kiê hẹp
        int c = 128;
        byte d = (byte) c;
        System.out.println(c);
        System.out.println(d);

        int e = 127;
        byte f = (byte) e;
        System.out.println(e);
        System.out.println(f);

    }
}

package Tu_Hoc.Bai3;
import java.util.Scanner;
public class Bai3_Luong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so gio lam: ");
        double soGio = sc.nextDouble();
        System.out.print("Nhap luong theo gio: ");
        double luongGio = sc.nextDouble();
        double tongLuong;
        if (soGio <= 40) {
            tongLuong = soGio * luongGio;
        } else {
            tongLuong = 40 * luongGio + (soGio - 40) * luongGio * 1.5;
        }
        System.out.println("Tong luong nhan vien: " + tongLuong);
    }
}

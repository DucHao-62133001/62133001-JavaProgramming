package Tu_Hoc.Bai1;
import java.util.Scanner;
public class Bai1_BacThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien tieu thu (kWh): ");
        int soDien = sc.nextInt();
        double tienDien;
        if (soDien <= 50) {
            tienDien = soDien * 1678;
        } else if (soDien <= 100) {
            tienDien = 50 * 1678 + (soDien - 50) * 1734;
        } else {
            tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        }
        System.out.println("Tien dien phai tra: " + tienDien + " VND");
    }
}

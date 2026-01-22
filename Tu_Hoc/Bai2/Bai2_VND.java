package Tu_Hoc.Bai2;
import java.util.Scanner;
public class Bai2_VND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien USD: ");
        double usd = sc.nextDouble();
        double tiGia = 23500;
        double vnd = usd * tiGia;
        System.out.println("So tien quy doi sang VND: " + vnd + " VND");
    }
}

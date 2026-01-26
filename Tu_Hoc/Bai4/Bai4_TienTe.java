package Tu_Hoc.Bai4;
import java.util.Scanner;
public class Bai4_TienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd, eur;
        double vndFromUsd, vndFromEur;
        System.out.print("Nhap so tien USD: ");
        usd = sc.nextDouble();
        System.out.print("Nhap so tien EUR: ");
        eur = sc.nextDouble();
        vndFromUsd = usd * 23500;
        vndFromEur = eur * 27000;
        System.out.println("So tien VND tu USD: " + vndFromUsd);
        System.out.println("So tien VND tu EUR: " + vndFromEur);

        sc.close();
    }
}

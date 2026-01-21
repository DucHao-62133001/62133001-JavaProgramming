package Bai1;
import java.util.Scanner;
public class Bai1_DTB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten sinh vien: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        double diemTB = sc.nextDouble();
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Diem trung binh: " + diemTB);
    }
}

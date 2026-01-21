package Bai3;
import java.util.Scanner;
public class Bai3_TheTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh khoi lap phuong: ");
        double canh = sc.nextDouble();
        double theTich = canh * canh * canh;
        System.out.println("The tich khoi lap phuong: " + theTich);
    }
}

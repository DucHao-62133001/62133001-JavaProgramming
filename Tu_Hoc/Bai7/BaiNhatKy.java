package Tu_Hoc.Bai7;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class BaiNhatKy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("1. Ghi nhat ky");
            System.out.println("2. Doc nhat ky");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine();
            if (chon == 1) {
                ghiNhatKy(sc);
            } else if (chon == 2) {
                docNhatKy();
            }
        } while (chon != 0);
    }
    public static void ghiNhatKy(Scanner sc) {
        try {
            FileWriter fw = new FileWriter("nhatky.txt", true);
            System.out.print("Nhap noi dung nhat ky: ");
            String noiDung = sc.nextLine();
            fw.write(noiDung + "\n");
            fw.close();
            System.out.println("Da ghi nhat ky!");
        } catch (IOException e) {
            System.out.println("Loi ghi file!");
        }
    }
    public static void docNhatKy() {
        try {
            FileReader fr = new FileReader("nhatky.txt");
            BufferedReader br = new BufferedReader(fr);
            String dong;
            System.out.println("Noi dung nhat ky:");
            while ((dong = br.readLine()) != null) {
                System.out.println(dong);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Chua co file nhat ky!");
        }
    }
}

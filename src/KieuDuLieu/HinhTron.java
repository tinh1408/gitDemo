package KieuDuLieu;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ban kinh r:");
        int r = scanner.nextInt(); // tên biến cần rõ ràng hơn ví dụ: banKinh
        double chuVi = r*2*3.14; // 3.14 là hằng số em nên khai báo là: final int PI = 3.14; nhé
        System.out.println("chu vi hinh tron :"+chuVi);
        double dienTich = r*r*3.14;
        System.out.println("dien tich hinh tron:"+dienTich);
    }
}

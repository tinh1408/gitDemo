package KieuDuLieu;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width;
        float height;
        System.out.println("nhap width:");
        width = scanner.nextFloat();
        System.out.println("nhap height:");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Area:"+area);
    }
}

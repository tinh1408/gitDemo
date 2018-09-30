package KieuDuLieu;

import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year,age;
        System.out.println("nhap nam sinh:");
       year = scanner.nextInt();
        age = 2018 - year;
        System.out.println("tuoi :"+age);

    }
}

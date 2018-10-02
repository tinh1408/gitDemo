package KieuDuLieu;

import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year,age;
        System.out.println("nhap nam sinh:");
       year = scanner.nextInt();
        age = 2018 - year; // nếu sang năm 2019 thì chương trình của em chạy không đúng nữa :D. Sửa lại như thế nào hè ?
        System.out.println("tuoi :"+age);

    }
}

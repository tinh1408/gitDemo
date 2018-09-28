package kieuDuLieu;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class DiemTB {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem ly:");
        float diemLy = scanner.nextFloat();//diem co the le dc
        System.out.println("nhap diem hoa:");
        float diemHoa = scanner.nextFloat();
        System.out.println("nhap diem sinh:");
        float diemSinh = scanner.nextFloat();
        if (((diemLy >= 0) && (diemLy <= 10) && (diemHoa >= 0) && (diemHoa <= 10) && (diemSinh >= 0) && (diemSinh <= 10))) {
            float diemTB = (diemLy + diemHoa + diemSinh) / 3;
            System.out.println("diem trung binh:" + diemTB);
            float tongTB = diemLy + diemHoa + diemSinh;
            System.out.println("tong trung binh:" + tongTB);
        }else {
            System.out.println("loi");
        }
    }
}

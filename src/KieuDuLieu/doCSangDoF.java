package KieuDuLieu;

import java.util.Scanner;

public class doCSangDoF {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do Fahrenheit:");
     float Fahrenheit = scanner.nextFloat();
     float Celsius =(Fahrenheit-32)/9;
     System.out.println("in ra do C:"+Celsius);
    }

}

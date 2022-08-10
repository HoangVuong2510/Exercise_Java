package day5.bai1;

import java.util.Scanner;

public class May {
    private Scanner scanner = new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void input() {
        System.out.print("nhap ma may: ");
        maMay = scanner.nextLine();
        System.out.print("nhap kieu may: ");
        kieuMay = scanner.nextLine();
        System.out.print("nhap tinh trang: ");
        tinhTrang = scanner.nextLine();
    }

    public void output() {
        System.out.println("Ma May: " + maMay);
        System.out.println("Kieu May: " + kieuMay);
        System.out.println("Tinh Trang: " + tinhTrang);
    }
}

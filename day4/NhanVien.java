package day4;

import java.util.Scanner;

/*
* Bài 2: (25đ) Khai báo 1 lớp NhanVien (class NhanVien) có các thuộc tính
mã nhân viên, tuổi, tên nhân viên, địa chỉ, bộ phận làm việc.
Mã nhân viên tự động tăng không cần nhập vào.
Khai báo 5 đối tượng NhanVien in ra thông tin của các nhân viên này dưới dạng bảng.
 * */
public class NhanVien {
    private static Scanner scanner = new Scanner(System.in);

    private static int temp = 0;
    private int maNV;
    private String tenNV;
    private int tuoi;
    private String diaChi;
    private String boPhan;

    public NhanVien(){
        maNV = ++temp;
    }
    public void input(){
        System.out.print("nhap ten nhan vien: ");
        tenNV = scanner.nextLine();
        System.out.print("nhap tuoi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("nhap bo phan: ");
        boPhan = scanner.nextLine();
    }
    public void output(){
        System.out.printf("\n%-10d%-10s%-10d%-10s%-10s", maNV, tenNV, tuoi, diaChi, boPhan);
    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        NhanVien nv3 = new NhanVien();
        NhanVien nv4 = new NhanVien();
        NhanVien nv5 = new NhanVien();

        nv1.input();
        nv2.input();
        nv3.input();
        nv4.input();
        nv5.input();

        System.out.println("\t\tTHONG TIN CAC NHAN VIEN");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s", "maNV", "tenNV", "tuoi", "diaChi", "boPhan");
        nv1.output();
        nv2.output();
        nv3.output();
        nv4.output();
        nv5.output();
    }
}
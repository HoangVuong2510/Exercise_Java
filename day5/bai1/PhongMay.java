package day5.bai1;
/*
* Bài 1: Cài đặt lớp Phòng máy với mỗi phòng gồm 1 máy tính và 1 người quản lý như  sau:
class PhongMay chứa các thuộc tính: maPhong, tenPhong, dienTich, QuanLy x, May y
class May chứa các thuộc tính: maMay, kieuMay, tinhTrang
class QuanLy cháu các thuộc tính: maQL, hoTen
In toàn bộ thông tin của phòng máy ra màn hình.
* */
import java.util.Scanner;

public class PhongMay {
    private Scanner scanner = new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x = new QuanLy();
    private May y = new May();

    public void input(){
        System.out.print("nhap ma phong: ");
        maPhong = scanner.nextLine();
        System.out.print("nhap ten phong: ");
        tenPhong = scanner.nextLine();
        System.out.print("nhap vao dien tich phong: ");
        dienTich = scanner.nextFloat();
        scanner.nextLine();
        x.input();
        y.input();
    }

    public void output(){
        System.out.println("Ma Phong: " + maPhong);
        System.out.println("Ten Phong: " + tenPhong);
        System.out.println("Dien Tich: " + dienTich);
        x.output();
        y.output();
    }

    public static void main(String[] args) {
        PhongMay a = new PhongMay();
        System.out.println("nhap thong tin phong may");
        a.input();
        System.out.println("\nthong tin phong may");
        a.output();
    }
}
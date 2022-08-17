package day6.bai1;

import java.util.Scanner;

public class CanBo {
    public static Scanner scanner = new Scanner(System.in);
    protected int id;
    public static int temp = 0;
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CanBo(){
        this.id = ++temp;
    }

    public void input(){
        System.out.print("nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("nhap nam sinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.print("nhap dia chi: ");
        diaChi = scanner.nextLine();
    }

    public void output(){
        System.out.printf("%d%20s%10d%10s%10s", id, hoTen, namSinh, gioiTinh, diaChi);
    }
}
package day6.bai2;

import java.util.Scanner;

public class PhuongTien {
    private Scanner scanner = new Scanner(System.in);
    private String tenChuPT;
    private String loaiPT;
    private int dungTich;
    private float triGia;

    public void input(){
        System.out.print("nhap ten chu phuong tien: ");
        tenChuPT = scanner.nextLine();
        System.out.print("nhap loai phuong tien: ");
        loaiPT = scanner.nextLine();
        System.out.print("nhap dung tich: ");
        dungTich = scanner.nextInt();
        System.out.print("nhap tri gia: ");
        triGia = scanner.nextFloat();
        scanner.nextLine();
    }

    public String getTenChuPT() {
        return tenChuPT;
    }

    public void setTenChuPT(String tenChuPT) {
        this.tenChuPT = tenChuPT;
    }

    public String getLoaiPT() {
        return loaiPT;
    }

    public void setLoaiPT(String loaiPT) {
        this.loaiPT = loaiPT;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }

    public float thue(){
        if(dungTich < 100)
            return triGia*0.02f;
        else if(dungTich < 200)
            return triGia*0.06f;
        else
            return triGia*0.1f;
    }

    public void output(){
        System.out.printf("%s%15s%10dcc%10.2f%10.2f\n", tenChuPT, loaiPT, dungTich, triGia, thue());
    }
}
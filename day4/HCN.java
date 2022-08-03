package day4;
/*
* Bài 1: (25đ) Khai báo 1 lớp HinhChuNhat có các thuộc tính là chiều dài, chiều rộng có các phương thức nhập (input), xuất (output), tính diện tích, tính chu vi.
Yêu cầu :
Nhập vào thông tin của lớp HinhChuNhat bằng 2 cách:
Cách 1: Nhập trong phương thức input và gọi vào trong hàm main.
Cách 2: Sử dụng getter, setter để nhập trực tiếp trong hàm main.
Khai báo 2 đối tượng HinhChuNhat a, HinhChuNhat b. In ra thông tin chiều dài, chiều rộng, diện tích, chu vi của từng hình chữ nhật.
So sánh xem hình chữ nhật nào có diện tích lớn hơn thì in ra màn hình.
* */
import java.util.Scanner;
public class HCN {
    private static Scanner scanner = new Scanner(System.in);
    private float length;
    private float width;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void input(){
        do {
            System.out.print("nhap chieu dai: ");
            length = scanner.nextFloat();
            System.out.print("nhap chieu rong: ");
            width = scanner.nextFloat();
            if(length < width)
                System.out.println("nhap sai! vui long nhap lai.");
        }while (length < width);
    }

    public void output(){
        System.out.println("chieu dai hcn: " + length);
        System.out.println("chieu rong hcn: " + width);
    }

    public float dienTichHCN(){
        return length * width;
    }

    public float chuViHCN(){
        return 2*(length + width);
    }

    public static void main(String[] args) {
        HCN a = new HCN();
        HCN b = new HCN();

        //C1
        System.out.println("nhap tt hcn a:");
        a.input();
        System.out.println("nhap tt hcn b:");
        b.input();

        //C2
//        float dai1, rong1, dai2, rong2;
//        do {
//            System.out.println("nhap tt hcn a:");
//            System.out.print("nhap chieu dai: ");
//            dai1 = scanner.nextFloat();
//            a.setLength(dai1);
//            System.out.print("nhap chieu rong: ");
//            rong1 = scanner.nextFloat();
//            a.setWidth(rong1);
//
//            System.out.println("nhap tt hcn b:");
//            System.out.print("nhap chieu dai: ");
//            dai2 = scanner.nextFloat();
//            b.setLength(dai2);
//            System.out.print("nhap chieu rong: ");
//            rong2 = scanner.nextFloat();
//            b.setWidth(rong2);
//
//            if(dai1 < rong1 || dai2 < rong2)
//                System.out.println("nhap sai! vui long nhap lai.");
//        }while (dai1 < rong1 || dai2 < rong2);
//        System.out.println("hcn a:");
//        System.out.printf("chieu dai hcn a: " + a.getLength());
//        System.out.printf("chieu rong hcn a: " + a.getWidth());
//        System.out.println("hcn b:");
//        System.out.printf("chieu dai hcn b: " + b.getLength());
//        System.out.printf("chieu rong hcn b: " + b.getWidth());

        System.out.println("\nhcn a:");
        a.output();
        System.out.printf("dien tich: " + a.dienTichHCN());
        System.out.printf("\nchu vi: " + a.chuViHCN());

        System.out.println("\n\nhcn b: ");
        b.output();
        System.out.printf("dien tich: " + b.dienTichHCN());
        System.out.printf("\nchu vi: " + b.chuViHCN());

        if(a.dienTichHCN() > b.dienTichHCN()){
            System.out.println("\ndien tich hcn a lon hon dien tich hcn b.");
            a.output();
        }
        else {
            System.out.println("\ndien tich hcn b lon hon dien tich hcn a.");
            b.output();
        }
    }
}
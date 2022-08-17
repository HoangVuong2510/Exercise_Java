package day6.bai2;

/*
* Bài 2: Sở giao thông cần theo dõi việc đăng ký xe của người dân. Dựa vào thông tin trị giá xe và dung tích xi lanh của xe, sở giao thông cũng tính mức thuế phải đóng trước bạ khi mua xe như sau:
- Dung tích dưới 100cc, 2% trị giá xe.
- Dung tích từ 100 đến 200cc, 6% trị giá xe.
- Dung tích trên 200cc, 10% trị giá xe.
Yêu cầu bài toán:
1. Thiết kế và cài đặt lớp phương tiện với các thuộc tính và phương thức phù hợp đảm đảm tính đóng gói theo hướng đối tượng.
2. Xây dựng lớp chứa hàm main. Hàm main in ra menu lựa chọn các công việc:
a. Nhập thông tin và tạo danh sách các xe
b. Xuất bảng kê khai tiền thuế trước bạ của các xe.
c. Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần
d. Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần
e. Thoát.
* */

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<PhuongTien> phuongTienList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("\t\t\tMenu");
        System.out.println("1. Nhap thong tin va tao danh sach cac xe");
        System.out.println("2. Xuat bang ke khai tien thue truoc ba cua cac xe.");
        System.out.println("3. Xuat bang ke khai tien thue truoc ba cua cac xe voi tien thue giam dan");
        System.out.println("4. Xuat bang ke khai tien thue truoc ba cua cac xe voi tri gia tang dan");
        System.out.println("5. Thoat.");
        int choose;
        do {
            System.out.print("nhap lua chon: ");
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1: {
                    nhapTTPT();
                    break;
                }
                case 2: {
                    xuatTTPT();
                    break;
                }
                case 3:{
                    xuatTTPTGiam();
                    break;
                }
                case 4:{
                    xuatTTPTTang();
                    break;
                }
                case 5: {
                    break;
                }
                default:
                    System.out.println("chuc nang ban chon khong ton tai. Chon lai!");
            }
        } while (choose != 5);
    }

    public static void nhapTTPT() {
        int choose;
        System.out.println("nhap danh sach phuong tien.");
        PhuongTien pt = new PhuongTien();
        pt.input();
        phuongTienList.add(pt);
        do {
            System.out.println("1. tiep tuc.");
            System.out.println("0. ket thuc.");
            System.out.print("lua chon: ");
            choose = scanner.nextInt();
            scanner.nextLine();
            if (choose == 1) {
                PhuongTien pt1 = new PhuongTien();
                pt1.input();
                phuongTienList.add(pt1);
            } else if (choose == 0) ;
            else System.out.println("nhap sai. Vui long nhap lai!");
        } while (choose != 0);
    }

    public static void xuatTTPT() {
        System.out.println("\t\tDanh sach phuong tien");
        System.out.printf("%s%15s%10s%10s%10s\n", "ten chu PT", "loai PT", "dung tich", "tri gia", "thue");
        for (int i = 0; i < phuongTienList.size(); i++) {
            phuongTienList.get(i).output();
        }
    }

    public static void swap(PhuongTien a, PhuongTien b){
        PhuongTien temp = new PhuongTien();
        temp.setTenChuPT(a.getTenChuPT());
        a.setTenChuPT(b.getTenChuPT());
        b.setTenChuPT(temp.getTenChuPT());

        temp.setLoaiPT(a.getLoaiPT());
        a.setLoaiPT(b.getLoaiPT());
        b.setLoaiPT(temp.getLoaiPT());

        temp.setDungTich(a.getDungTich());
        a.setDungTich(b.getDungTich());
        b.setDungTich(temp.getDungTich());

        temp.setTriGia(a.getTriGia());
        a.setTriGia(b.getTriGia());
        b.setTriGia(temp.getTriGia());
    }

    public static void xuatTTPTGiam(){
        System.out.println("\t\tDanh sach phuong tien theo chieu thue giam");
        System.out.printf("%s%15s%10s%10s%10s\n", "ten chu PT", "loai PT", "dung tich", "tri gia", "thue");
        for(int i = 0; i<phuongTienList.size(); i++)
            for (int j = 0; j < phuongTienList.size()-i-1; j++)
                if(phuongTienList.get(j).thue() < phuongTienList.get(j+1).thue())
                    swap(phuongTienList.get(j), phuongTienList.get(j+1));
        for (int i = 0; i < phuongTienList.size(); i++) {
            phuongTienList.get(i).output();
        }
    }

    public static void xuatTTPTTang(){
        System.out.println("\t\tDanh sach phuong tien theo chieu thue tang");
        System.out.printf("%s%15s%10s%10s%10s\n", "ten chu PT", "loai PT", "dung tich", "tri gia", "thue");
        for(int i = 0; i<phuongTienList.size(); i++)
            for (int j = 0; j < phuongTienList.size()-i-1; j++)
                if(phuongTienList.get(j).thue() > phuongTienList.get(j+1).thue())
                    swap(phuongTienList.get(j), phuongTienList.get(j+1));
        for (int i = 0; i < phuongTienList.size(); i++) {
            phuongTienList.get(i).output();
        }
    }
}
package day6.bai1;

/*
* Bài 1: Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
+ Mỗi cán bộ cần quản lý các thuộc tính: id không trùng nhau, họ tên, năm sinh, giới tính, địa chỉ.
+ Các công nhân cần quản lý: Bậc (công nhân bậc 3/7, bậc 4/7 ...)
+ Các kỹ sư cần quản lý: Ngành đào tạo
+ Các nhân viên phục vụ cần quản lý thông tin: công việc

1. Xây dựng các lớp NhanVien, CongNhan, KySu kế thừa từ lớp CanBo
2. Xây dựng các hàm để truy nhập, hiển thị thông tin và kiểm tra về các thuộc tính của các lớp.
3. Xây dựng lớp QLCB có menu như sau:
1: Add 1 cán bộ vào List tương ứng
2: Hiển thị danh sách các cán bộ
3: Xóa 1 cán bộ theo id
4: Tìm kiếm 1 cán bộ theo id
5: Dừng chương trình

Yêu cầu:
công nhân, kỹ sư, nhân viên là các class con của cán bộ.
viết chương trình theo các hàm, tham khảo btvn buổi 5
* */

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<CongNhan> congNhanList = new ArrayList<CongNhan>();
    public static ArrayList<KySu> kySuList = new ArrayList<KySu>();
    public static ArrayList<NhanVien> nhanVienList = new ArrayList<NhanVien>();

    public static void main(String[] args) {

        int choose;
        do {
            System.out.println("==========================================");
            System.out.println("\t\tchon chuc nang");
            System.out.println("1: Add 1 can bo vao List tuong ung.");
            System.out.println("2: Hien thi danh sach cac can bo");
            System.out.println("3: Xoa 1 can bo theo id");
            System.out.println("4: Tim kiem 1 can bo theo id");
            System.out.println("5: Dung chuong trinh");
            System.out.print("chuc nang ban chon la: ");
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1: {
                    System.out.println("==========================================");
                    addCanBo();
                    break;
                }
                case 2:{
                    System.out.println("==========================================");
                    hienThiDSCB();
                    break;
                }
                case 3:{
                    System.out.println("==========================================");
                    xoaCB();
                    break;
                }

                case 4:{
                    System.out.println("==========================================");
                    timKiemCB();
                    break;
                }

                case 5: {
                    break;
                }
                default:
                    System.out.println("chuc nang ban chon khong ton tai. chon lai!");
            }
        } while (choose != 5);

    }

    public static void addCanBo() {
        int choose;
        do {
            System.out.println("--------------------");
            System.out.println("chuc vu cua can bo muon them: ");
            System.out.println("1. cong nhan.");
            System.out.println("2. ky su.");
            System.out.println("3. nhan vien phuc vu.");
            System.out.println("0. quay lai menu.");
            System.out.print("nhap lua chon cua ban: ");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1: {
                    CongNhan cn = new CongNhan();
                    cn.inputCN();
                    congNhanList.add(cn);
                    break;
                }
                case 2: {
                    KySu ks = new KySu();
                    ks.inputKS();
                    kySuList.add(ks);
                    break;
                }
                case 3: {
                    NhanVien nv = new NhanVien();
                    nv.inputNV();
                    nhanVienList.add(nv);
                    break;
                }
                case 0: {
                    break;
                }
                default:{
                    System.out.println("lua chon khong phu hop, chon lai!");
                }

            }
        } while (choose != 0);
    }

    public static void hienThiDSCB() {
        System.out.println("--------------------");
        System.out.println("chuc vu cua can bo muon hien thi: ");
        System.out.println("1. cong nhan.");
        System.out.println("2. ky su.");
        System.out.println("3. nhan vien phuc vu.");
        System.out.println("4. tat ca.");
        System.out.println("0. quay lai menu.");
        int choose;
        do {
            System.out.print("nhap lua chon cua ban: ");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1: {
                    if (congNhanList.isEmpty()) System.out.println("danh sach trong");
                    else {
                        System.out.println("\t\tdanh sach cong nhan");
                        System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "bac");
                        for (int i = 0; i < congNhanList.size(); i++) {
                            congNhanList.get(i).output();
                        }
                    }
                    break;
                }
                case 2: {
                    if (kySuList.isEmpty()) System.out.println("danh sach trong");
                    else {
                        System.out.println("\t\tdanh sach ky su");
                        System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "nganh DT");
                        for (int i = 0; i < kySuList.size(); i++) {
                            kySuList.get(i).output();
                        }
                    }
                    break;
                }
                case 3: {
                    if (nhanVienList.isEmpty()) System.out.println("danh sach trong");
                    else {
                        System.out.println("\t\tdanh sach nhan vien phuc vu");
                        System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "cong viec");
                        for (int i = 0; i < nhanVienList.size(); i++) {
                            nhanVienList.get(i).output();
                        }
                    }
                    break;
                }
                case 4:{
                    if (congNhanList.isEmpty()) System.out.println("danh sach trong");
                    else {
                        System.out.println("\t\tdanh sach cong nhan");
                        System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "bac");
                        for (int i = 0; i < congNhanList.size(); i++) {
                            congNhanList.get(i).output();
                        }
                    }
                    if (kySuList.isEmpty()) System.out.println("danh sach trong");
                    else {
                        System.out.println("\t\tdanh sach ky su");
                        System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "nganh DT");
                        for (int i = 0; i < kySuList.size(); i++) {
                            kySuList.get(i).output();
                        }
                    }
                    if (nhanVienList.isEmpty()) System.out.println("danh sach trong");
                    else {
                        System.out.println("\t\tdanh sach nhan vien phuc vu");
                        System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "cong viec");
                        for (int i = 0; i < nhanVienList.size(); i++) {
                            nhanVienList.get(i).output();
                        }
                    }
                }
                case 0: {
                    break;
                }
                default:
                    System.out.println("lua chon khong phu hop, chon lai!");
            }
        } while (choose != 0);
    }

    public static void xoaCB(){
        int choose;
        System.out.println("--------------------");
        System.out.println("1. cong nhan.");
        System.out.println("2. ky su.");
        System.out.println("3. nhan vien phuc vu.");
        System.out.println("4. quen chuc vu");
        System.out.print("can bo ban muon xoa thuoc chuc vu: ");
        choose = scanner.nextInt();
        scanner.nextLine();
        int a;
        System.out.print("nhap vao id can bo muon xoa: ");
        a = scanner.nextInt();
        do {
            switch (choose){
                case 1:{
                    int count = 0;
                    for(int i = 0; i < congNhanList.size(); i++){
                        if(congNhanList.get(i).getId() == a){
                            congNhanList.remove(i);
                            System.out.println("xoa thanh cong");
                            count++;
                        }
                    }
                    if(count == 0)
                        System.out.println("id ban nhap khong ton tai trong danh sach cong nhan. vui long kiem tra lai");
                    break;
                }
                case 2:{
                    int count = 0;
                    for(int i = 0; i < kySuList.size(); i++){
                        if(kySuList.get(i).getId() == a){
                            kySuList.remove(i);
                            System.out.println("xoa thanh cong");
                            count++;
                        }
                    }
                    if(count == 0)
                        System.out.println("id ban nhap khong ton tai trong danh sach ky su. vui long kiem tra lai");
                    break;
                }
                case 3:{
                    int count = 0;
                    for(int i = 0; i < nhanVienList.size(); i++){
                        if(nhanVienList.get(i).getId() == a){
                            nhanVienList.remove(i);
                            System.out.println("xoa thanh cong");
                            count++;
                        }
                    }
                    if(count == 0)
                        System.out.println("id ban nhap khong ton tai trong danh sach nhan vien phuc vu. vui long kiem tra lai!");
                    break;
                }
                case 4:{
                    int count = 0;
                    for(int i = 0; i < congNhanList.size(); i++){
                        if(congNhanList.get(i).getId() == a){
                            System.out.println("can bo ban muon xoa co chuc vu cong nhan.");
                            congNhanList.remove(i);
                            System.out.println("da xoa thanh cong");
                            count++;
                        }
                    }
                    for(int i = 0; i < kySuList.size(); i++){
                        if(kySuList.get(i).getId() == a){
                            System.out.println("can bo ban muon xoa co chuc vu ky su.");
                            kySuList.remove(i);
                            System.out.println("da xoa thanh cong");
                            count++;
                        }
                    }
                    for(int i = 0; i < nhanVienList.size(); i++){
                        if(nhanVienList.get(i).getId() == a){
                            System.out.println("can bo ban muon xoa co chuc vu nhan vien phuc vu.");
                            nhanVienList.remove(i);
                            System.out.println("da xoa thanh cong");
                            count++;
                        }
                    }
                    if(count == 0)
                        System.out.println("id ban nhap khong ton tai. vui long kiem tra lai");
                }
                default:
                    System.out.println("chon sai. Vui long chon lai!");
            }
        }while (choose < 1 || choose > 4);
    }
    public static void timKiemCB(){
        int choose;
        System.out.println("--------------------");
        System.out.println("1. cong nhan.");
        System.out.println("2. ky su.");
        System.out.println("3. nhan vien phuc vu.");
        System.out.println("4. quen chuc vu");
        System.out.print("can bo ban muon tim thuoc chuc vu: ");
        choose = scanner.nextInt();
        scanner.nextLine();
        int a;
        System.out.print("nhap vao id can bo muon tim: ");
        a = scanner.nextInt();
        do {
            switch (choose){
                case 1:{
                    int count = 0;
                    for(int i = 0; i < congNhanList.size(); i++){
                        if(congNhanList.get(i).getId() == a){
                            System.out.println("thong tin can bo can tim: ");
                            System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "bac");
                            congNhanList.get(i).output();
                            count++;
                        }
                    }
                    if(count == 0)
                        System.out.println("id ban nhap khong ton tai trong danh sach cong nhan. vui long kiem tra lai!");
                    break;
                }
                case 2:{
                    int count = 0;
                    for(int i = 0; i < kySuList.size(); i++){
                        if(kySuList.get(i).getId() == a){
                            System.out.println("thong tin can bo can tim: ");
                            System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "nganh DT");
                            kySuList.get(i).output();
                            count++;
                        }
                    }
                    if(count == 0)
                        System.out.println("id ban nhap khong ton tai trong danh sach ky su. vui long kiem tra lai!");
                    break;
                }
                case 3:{
                    int count = 0;
                    for(int i = 0; i < nhanVienList.size(); i++){
                        if(nhanVienList.get(i).getId() == a){
                            System.out.println("thong tin can bo can tim: ");
                            System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "cong viec");
                            congNhanList.get(i).output();
                            count++;
                        }
                    }
                    if(count == 0)
                        System.out.println("id ban nhap khong ton tai trong danh sach nhan vien phuc vu. vui long kiem tra lai!");
                    break;
                }
                case 4:{
                    int count = 0;
                    for(int i = 0; i < congNhanList.size(); i++){
                        if(congNhanList.get(i).getId() == a){
                            System.out.println("can bo ban tim co chuc vu cong nhan.");
                            System.out.println("thong tin can bo can tim: ");
                            System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "bac");
                            congNhanList.get(i).output();
                            count++;
                        }
                    }
                    for(int i = 0; i < kySuList.size(); i++){
                        if(kySuList.get(i).getId() == a){
                            System.out.println("can bo ban tim co chuc vu ky su.");
                            System.out.println("thong tin can bo can tim: ");
                            System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "nganh DT");
                            kySuList.get(i).output();
                            count++;
                        }
                    }
                    for(int i = 0; i < nhanVienList.size(); i++){
                        if(nhanVienList.get(i).getId() == a){
                            System.out.println("can bo ban tim co chuc vu nhan vien phuc vu.");
                            System.out.println("thong tin can bo can tim: ");
                            System.out.printf("%s%20s%10s%10s%10s%10s\n", "id", "ho ten", "nam sinh", "gioi tinh", "dia chi", "cong viec");
                            nhanVienList.get(i).output();;
                            count++;
                        }
                    }
                    if(count == 0)
                        System.out.println("id ban nhap khong ton tai. vui long kiem tra lai");
                }
                default:
                    System.out.println("chon sai. Vui long chon lai!");
            }
        }while (choose < 1 || choose > 4);
    }
}
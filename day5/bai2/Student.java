package day5.bai2;

/*
* Bài 2:
Tạo class Address: id, district, province, viết các phương thức nhập, xuất.
Tạo class Student: id, name, age, Address, viết các phương thức nhập, xuất.
Các id không được trùng nhau.
Tại hàm main viết menu thực hiện các chức năng sau:
1. Nhập một mảng n sinh viên
2. Hiển thị thông tin các sinh viên ra màn hình.
3. Tìm kiếm sinh viên theo Id và hiển thị ra màn hình.
4. Sửa các sinh viên có province là “Thanh Hóa” thành “Hải Phòng”
5. Xóa sinh viên theo Id.
* */

import java.util.Scanner;

public class Student {
    public static Scanner scanner = new Scanner(System.in);
    private int id;
    private String ten;
    private int tuoi;
    private Address address = new Address();

    public int getId() {
        return id;
    }

    public void input() {
        System.out.print("nhap id sinh vien: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("nhap ten: ");
        ten = scanner.nextLine();
        System.out.print("nhap tuoi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        address.input();
    }

    public void output() {
        System.out.printf("%d%10s%10d", id, ten, tuoi);
        address.output();
    }

    public static Student[] xoaMang(Student []sv, int pos) {
        Student[] newSV = new Student[sv.length-1];
        for(int i=0;i<pos-1;i++)
            newSV[i]=sv[i];
        for(int i = pos;i<sv.length;i++)
            newSV[i-1]=sv[i];
        return newSV;
    }

    public static void main(String[] args) {
        int n, x;
        System.out.print("nhap so sinh vien: ");
        n = scanner.nextInt();
        scanner.nextLine();
        Student sv[] = new Student[n];

        System.out.println("nhap thong tin sinh vien thu 1");
        sv[0] = new Student();
        sv[0].input();
        for (int i = 1; i < sv.length; i++) {
            System.out.println("nhap thong tin sinh vien thu " + (i + 1));
            sv[i] = new Student();
            sv[i].input();
            for (int j = 0; j < i; j++) {
                do {
                    if (sv[i].getId() == sv[j].getId()) {
                        System.out.println("id SV bi trung, vui long nhap lai");
                        System.out.println("nhap thong tin sinh vien thu " + (i + 1));
                        sv[i].input();
                    }
                } while (sv[i].getId() == sv[j].getId());
            }
        }

        System.out.println("\t\tchuc nang");
        System.out.println("1. Hien thi thong tin cac sinh vien ra man hinh.");
        System.out.println("2. Tim kiem sinh vien theo Id va hien thi ra man hinh.");
        System.out.println("3. Sua cac sinh vien co province la 'Thanh Hoa' thanh 'Hai Phong'");
        System.out.println("4. Xoa sinh vien theo Id.");

        int choose;
        do {
            System.out.print("chuc nang ban chon la: ");
            choose = scanner.nextInt();
            scanner.nextLine();
            if (choose < 0 || choose > 4)
                System.out.println("chuc nang ban chon khong dung. vui long chon lai!");
        } while (choose < 0 || choose > 4);

        switch (choose) {
            case 1: {
                System.out.println("\tthong tin cac sinh vien");
                System.out.printf("%s%5s%10s%10s%5s%5s\n", "id SV", "ten", "tuoi", "id dc", "quan", "tinh");
                for (int i = 0; i < sv.length; i++) {
                    sv[i].output();
                }
                break;
            }
            case 2: {
                System.out.print("nhap id sv can tim: ");
                x = scanner.nextInt();
                scanner.nextLine();
                int count = 0;
                System.out.printf("thong tin sv co id " + x + ":\n");
                for (int i = 0; i < sv.length; i++) {
                    if (sv[i].getId() == x) {
                        System.out.printf("%s%5s%10s%10s%5s%5s\n", "id SV", "ten", "tuoi", "id dc", "quan", "tinh");
                        sv[i].output();
                        count++;
                    }
                }
                if (count == 0)
                    System.out.println("khong tim thay.");
                break;
            }
            case 3: {
                System.out.println("\t\tdanh sach sau khi sua tinh");
                System.out.printf("%s%5s%10s%10s%5s%5s\n", "id SV", "ten", "tuoi", "id dc", "quan", "tinh");
                for(int i = 0; i < sv.length; i++){
                    if(sv[i].address.getTinh().equalsIgnoreCase("Thanh Hoa")){
                        sv[i].address.setTinh("Hai Phong");
                    }

                    sv[i].output();
                }
                break;
            }
            case 4: {
                System.out.print("nhap id sv can xoa: ");
                x = scanner.nextInt();
                scanner.nextLine();

                int count = 0;
                for(int i = 0; i< sv.length; i++){
                    if(sv[i].getId() == x){
                        sv = xoaMang(sv, x);
                        count++;
                    }
                }
                if(count == 0)
                    System.out.println("id sv ban nhap khong ton tai!");
                else{
                    System.out.println("danh sach sinh vien sau khi xoa");
                    System.out.printf("%s%5s%10s%10s%5s%5s\n", "id SV", "ten", "tuoi", "id dc", "quan", "tinh");
                    for (int i = 0; i<sv.length; i++){
                        sv[i].output();
                    }
                }
                break;
            }
        }
    }
}

//  Nhập vào ngày tháng năm sinh và in ra cung hoàng đạo
package day2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day, month, year;
        System.out.print("nhap vao ngay sinh: ");
        day = scanner.nextInt();
        System.out.print("nhap vao thang sinh: ");
        month = scanner.nextInt();
        System.out.print("nhap vao nam sinh: ");
        year = scanner.nextInt();

        switch (month) {
            case 1 : {
                if(day >= 1 && day <= 19)
                    System.out.println("ban thuoc cung Ma Ket");
                else if(day >= 20 && day <= 31)
                    System.out.println("ban thuoc cung Bao Binh");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 2 : {
                if(day >= 1 && day <= 18)
                    System.out.println("ban thuoc cung Bao Binh");
                else if(day >= 19 && day <= 29)
                    System.out.println("ban thuoc cung Song Ngu");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 3 : {
                if(day >= 1 && day <= 20)
                    System.out.println("ban thuoc cung Song Ngu");
                else if(day >= 21 && day <= 31)
                    System.out.println("ban thuoc cung Bach Duong");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 4 : {
                if(day >= 1 && day <= 20)
                    System.out.println("ban thuoc cung Bach Duong");
                else if(day >= 21 && day <= 30)
                    System.out.println("ban thuoc cung Kim Nguu");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 5 : {
                if(day >= 1 && day <= 20)
                    System.out.println("ban thuoc cung Kim Nguu");
                else if(day >= 21 && day <= 31)
                    System.out.println("ban thuoc cung Song Tu");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 6: {
                if(day >= 1 && day <= 21)
                    System.out.println("ban thuoc cung Song Tu");
                else if(day >= 22 && day <= 30)
                    System.out.println("ban thuoc cung Cu Giai");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 7: {
                if(day >= 1 && day <= 22)
                    System.out.println("ban thuoc cung Cu Giai");
                else if(day >= 23 && day <= 31)
                    System.out.println("ban thuoc cung Su Tu");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 8: {
                if(day >= 1 && day <= 22)
                    System.out.println("ban thuoc cung Su Tu");
                else if(day >= 23 && day <= 31)
                    System.out.println("ban thuoc cung Xu Nu");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 9: {
                if(day >= 1 && day <= 22)
                    System.out.println("ban thuoc cung Xu Nu");
                else if(day >= 23 && day <= 30)
                    System.out.println("ban thuoc cung Thien Binh");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 10: {
                if(day >= 1 && day <= 23)
                    System.out.println("ban thuoc cung Thien Binh");
                else if(day >= 24 && day <= 31)
                    System.out.println("ban thuoc cung Bo Cap");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 11: {
                if(day >= 1 && day <= 22)
                    System.out.println("ban thuoc cung Bo Cap");
                else if(day >= 23 && day <= 30)
                    System.out.println("ban thuoc cung Nhan Ma");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            case 12: {
                if(day >= 1 && day <= 21)
                    System.out.println("ban thuoc cung Nhan Ma");
                else if(day >= 22 && day <= 31)
                    System.out.println("ban thuoc cung ma Ket");
                else
                    System.out.println("ngay ban nhap khong dung.");
                break;
            }
            default:
                System.out.println("thang ban nhap khong dung");
        }
    }
}
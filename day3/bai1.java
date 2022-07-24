/*
Bài 1: (50đ) Nhập từ bàn phím mảng số nguyên gồm n phần tử.
Tính trung bình cộng các số lẻ ở vị trí chẵn
Tìm vị trí các số nhỏ nhất trong mảng
Kiểm tra mảng có số chính phương không? Nếu có hiển thị ra màn hình
Hiển thị các số nguyên tố có trong mảng lên màn hình
Sắp xếp mảng đã nhập theo thứ tự tăng dần
* */

package day3;

import java.util.Scanner;

public class bai1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("nhap vao so phan tu mang: ");
            n = scanner.nextInt();
            if(n <= 0)
                System.out.println("nhap sai, vui long nhap lai.");
        }while(n <= 0);

        int arr[] = new int[n];
        nhapMang(arr, n);

//Tính trung bình cộng các số lẻ ở vị trí chẵn
        float tbc = 0;
        int count = 0;
        int tong = 0;
        for(int i = 0; i<n; i++) {
            if((i+1)%2 == 0 && arr[i]%2 != 0) {
                tong += arr[i];
                count++;
            }
        }
        if(count > 0) {
            tbc = (float)tong/count;
            System.out.println("trung binh cong cac so le o vi tri chan la: " + tbc);
        }
        else
            System.out.println("mang khong co so le o vi tri chan nao");

//Tìm vị trí các số nhỏ nhất trong mảng
        System.out.print("vi tri cac so nho nhat trong mang la: ");
        int SoNN = soNN(arr, n);
        for(int i = 0; i<n; i++)
            if(arr[i] == SoNN)
                System.out.print((i+1) + " ");

//Kiểm tra mảng có số chính phương không? Nếu có hiển thị ra màn hình
        int count1 = 0;
        System.out.print("\nso chinh phuong: ");
        for(int i = 0; i<n; i++)
            if(ktraCP(arr[i]) == true) {
                System.out.print(arr[i] + " ");
                count1++;
            }
        if(count1 == 0)
            System.out.print("mang khong co so chinh phuong");


//Hiển thị các số nguyên tố có trong mảng lên màn hình
        int count2 = 0;
        System.out.print("\nso nguyen to: ");
        for(int i = 0; i<n; i++)
        {
            if(ktraNT(arr[i]) == true){
                System.out.print(arr[i] + " ");
                count2++;
            }
        }
        if(count2 == 0)
            System.out.print("mang khong co snt nao");

//Sắp xếp mảng đã nhập theo thứ tự tăng dần
        sort(arr, n);
        System.out.print("\nmang sau khi sap xep tang: ");
        xuatMang(arr, n);

    }

    public static void nhapMang(int a[], int n) {
        for(int i = 0; i<n; i++) {
            System.out.printf("Arr[%d] = ", i);
            a[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int a[], int n) {
        for (int i : a) {
            System.out.printf(i + "\t");
        }
    }

    //Tìm vị trí các số nhỏ nhất trong mảng
    public static int soNN(int a[], int n) {
        int min = a[0];
        for(int i = 1; i<n; i++)
            if(a[i] < min)
                min = a[i];
        return min;
    }

    //Kiểm tra mảng có số chính phương không?
    public static boolean ktraCP(int x) {
        if((float)Math.sqrt(x) == (int)Math.sqrt(x))
            return true;
        else
            return false;
    }

    //KT số nguyên tố
    public static boolean ktraNT(int x) {
        if(x < 2)
            return false;
        else {
            int count = 0;
            for(int i = 2; i <= x/2; i++){
                if(x%i == 0) {
                    count++;
                }
            }
            if(count > 0)
                return false;
            else
                return true;
        }
    }

    //Sắp xếp mảng đã nhập theo thứ tự tăng dần
    public static void sort(int a[], int n) {
        for(int i = 0; i<n; i++)
            for(int j = i+1; j<n; j++)
                if(a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
    }
}

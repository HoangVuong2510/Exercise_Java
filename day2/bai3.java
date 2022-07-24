//Nhập n hãy tính tổng các ước của n(bao gồm cả 1 và n)
package day2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("nhap n: ");
        n = scanner.nextInt();

        int tongUoc = n;
        for(int i = 1; i <= n/2; i++)
        {
            if(n%i == 0)
                tongUoc += i;
        }
        System.out.println("tong cac uoc cua n la: " + tongUoc);
    }
}